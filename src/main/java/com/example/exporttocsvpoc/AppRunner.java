package com.example.exporttocsvpoc;

import com.example.exporttocsvpoc.search.CustomRolesSearchResult;
import com.example.exporttocsvpoc.search.UserSearchResult;
import com.example.exporttocsvpoc.search.UserSearched;
import com.example.types.TicketForm;
import com.example.types.TicketFormPut;
import com.example.types.TicketForm_;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Component
public class AppRunner implements CommandLineRunner {
    String QUERY_AGENTES = "type:user role:agent";
    String QUERY_ADMINS = "type:user role:admin";
    @Value("${fields.fraud}")
    String FIELD_FRAUDE;

    @Autowired
    ZendeskService zendeskService;

    Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private static<T> CompletableFuture<List<T>> sequence(List<CompletableFuture<T>> list) {
        return CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()]))
                .thenApply(v -> list.stream()
                        .map(CompletableFuture::join)
                        .collect(toList())
                );
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Iniciando...");
        geraCsvAgentesComFuncao();
        logger.info("Concluído!");
    }

    private void atualizaFormsComFieldNecessario() {
        List<TicketForm_> allTicketForms = zendeskService.ticketForms().getTicketForms();
        List<TicketFormPut> formsToUpdate = allTicketForms
                .stream()
                .filter(t -> !t.getName().equalsIgnoreCase("Anatel"))
                .filter(t -> !t.getTicketFieldIds().contains(new BigInteger(FIELD_FRAUDE)))
                .peek(t -> t.getTicketFieldIds().add(new BigInteger(FIELD_FRAUDE)))
                .map(t -> {
                    TicketForm ticketForm = new TicketForm();
                    ticketForm.setId(t.getId());
                    ticketForm.setTicketFieldIds(t.getTicketFieldIds());
                    TicketFormPut ticketFormPut = new TicketFormPut();
                    ticketFormPut.setTicketForm(ticketForm);
                    return ticketFormPut;
                })
                .collect(Collectors.toList());

        formsToUpdate.forEach(ticketFormPut -> {
            logger.info("ticketFormId: " + ticketFormPut.getTicketForm().getId());
            try {
                zendeskService.mudaTicketForm(ticketFormPut);
            } catch (HttpClientErrorException | HttpServerErrorException e) {
                logger.warn(
                    "Exception no formId " + ticketFormPut.getTicketForm().getId(), e
                );
            }
        });
    }

    private void geraCsvAgentesComFuncao() throws InterruptedException, java.util.concurrent.ExecutionException, java.io.IOException {
        List<UserCsv> usersCsv = getUsersCsv(QUERY_AGENTES);
        CustomRolesSearchResult customRolesSearchResult = zendeskService.buscaFuncoes();
        usersCsv.forEach(user -> user.setFuncao(user.custom_role_id == null ? "" : customRolesSearchResult.findById(user.custom_role_id)));
        CsvUtil.exportToCsv("exportados/agentesComFuncao.csv", UserCsv.class, usersCsv);
    }

    private void geraCsvAdmins() throws InterruptedException, java.util.concurrent.ExecutionException, java.io.IOException {
        List<UserCsv> usersCsv = getUsersCsv(QUERY_ADMINS);
        CsvUtil.exportToCsv("exportados/admins.csv", UserCsv.class, usersCsv);
    }

    private List<UserCsv> getUsersCsv(String query) throws InterruptedException, java.util.concurrent.ExecutionException, java.io.IOException {
        Long countDaBuscaDeUsuarios = zendeskService.getCountDaBuscaDeUsuarios(query);
        logger.info("Total de resultados: " + countDaBuscaDeUsuarios);
        Long pageCount = (long) Math.ceil(countDaBuscaDeUsuarios/100.0);
        logger.info("Total de páginas: " + pageCount);
        List<CompletableFuture<UserSearchResult>> paginas = new ArrayList<>();
        for (int i = 1; i <= pageCount; i++) {
            logger.info("Buscando página " + i + " / " + pageCount);
            paginas.add(zendeskService.buscaUsuarios(query, i));
        }
        CompletableFuture<List<UserSearchResult>> listCompletableFuture = AppRunner.sequence(paginas);

        List<UserSearched> userSearcheds = new ArrayList<>();
        for (UserSearchResult userSearchResult : listCompletableFuture.get()) {
            userSearcheds.addAll(userSearchResult.getResults());
        }
        return userSearcheds
                .stream()
                .map(UserSearched::toUserCsv)
                .collect(Collectors.toList());
    }
}
