package com.example.exporttocsvpoc;

import com.example.exporttocsvpoc.search.CustomRolesSearchResult;
import com.example.exporttocsvpoc.search.UserSearchResult;
import com.example.exporttocsvpoc.search.UserSearched;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    ZendeskService zendeskService;

    Logger logger = LoggerFactory.getLogger(AppRunner.class);

    static<T> CompletableFuture<List<T>> sequence(List<CompletableFuture<T>> list) {
        return CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()]))
                .thenApply(v -> list.stream()
                        .map(CompletableFuture::join)
                        .collect(toList())
                );
    }

    @Override
    public void run(String... args) throws Exception {
        Long countBusca1 = zendeskService.getCountBusca1();
        logger.info("Total de resultados: " + countBusca1);
        Long pageCount = (long) Math.ceil(countBusca1/100.0);
        logger.info("Total de páginas: " + pageCount);
        List<CompletableFuture<UserSearchResult>> paginas = new ArrayList<>();
        for (int i = 1; i <= pageCount; i++) {
            paginas.add(zendeskService.buscaUsuarios(i));
        }
        CustomRolesSearchResult customRolesSearchResult = zendeskService.buscaFuncoes();
        CompletableFuture<List<UserSearchResult>> listCompletableFuture = AppRunner.sequence(paginas);

        List<UserSearched> userSearcheds = new ArrayList<>();
        for (UserSearchResult userSearchResult : listCompletableFuture.get()) {
            userSearcheds.addAll(userSearchResult.getResults());
        }
        List<UserCsv> usersCsv = userSearcheds.stream().map(UserSearched::toUser).collect(Collectors.toList());
        usersCsv.forEach(user -> user.setFuncao(user.custom_role_id == null ? "" : customRolesSearchResult.findById(user.custom_role_id)));
        CsvUtil.exportToCsv("exportados/busca1.csv", UserCsv.class, usersCsv);
        logger.info("Concluído");
    }
}
