package com.example.exporttocsvpoc;

import com.example.exporttocsvpoc.model.custom.role.CustomRole;
import com.example.exporttocsvpoc.model.custom.role.CustomRolesSearchResult;
import com.example.exporttocsvpoc.model.user.User;
import com.example.exporttocsvpoc.model.user.UserCsv;
import com.example.exporttocsvpoc.model.user.UserSearchResult;
import com.example.exporttocsvpoc.utils.AsyncUtils;
import com.example.exporttocsvpoc.utils.CsvUtils;
import com.example.exporttocsvpoc.utils.ZendeskAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Component
public class ReportsGeneration {
    final String QUERY_AGENTES = "type:user role:agent";
    final String QUERY_ADMINS = "type:user role:admin";
    final Logger logger = LoggerFactory.getLogger(ReportsGeneration.class);

    @Autowired
    ZendeskAPI zendeskAPI;
    @Autowired
    CsvUtils csvUtils;
    @Autowired
    AsyncUtils asyncUtils;

    private List<UserCsv> getUsersCsv(String query) throws InterruptedException, java.util.concurrent.ExecutionException, java.io.IOException {
        BigInteger countDaBuscaDeUsuarios = this.getCountDaBuscaDeUsuarios(query);
        logger.info("Total de resultados: " + countDaBuscaDeUsuarios);
        Long pageCount = (long) Math.ceil(countDaBuscaDeUsuarios.longValueExact()/100.0);
        logger.info("Total de páginas: " + pageCount);
        List<CompletableFuture<UserSearchResult>> paginas = new ArrayList<>();
        for (int i = 1; i <= pageCount; i++) {
            logger.info("Buscando página " + i + "/" + pageCount);
            paginas.add(asyncUtils.buscaUsuariosAsync(query, i));
        }
        CompletableFuture<List<UserSearchResult>> listCompletableFuture = asyncUtils.sequence(paginas);

        List<User> userSearcheds = new ArrayList<>();
        for (UserSearchResult userSearchResult : listCompletableFuture.get()) {
            userSearcheds.addAll(userSearchResult.getResults());
        }
        return userSearcheds
                .stream()
                .map(User::toUserCsv)
                .collect(Collectors.toList());
    }

    public void geraCsvAgentesComFuncao() throws InterruptedException, java.util.concurrent.ExecutionException, java.io.IOException {
        List<UserCsv> usersCsv = getUsersCsv(QUERY_AGENTES);
        CustomRolesSearchResult customRolesSearchResult = zendeskAPI.getCustomRolesSearch();
        for (UserCsv u : usersCsv) {
            if (u.getCustom_role_id() != null) {
                Optional<CustomRole> optionalCustomRole
                        = customRolesSearchResult.findById(u.getCustom_role_id());
                optionalCustomRole.ifPresent(customRole -> u.setFuncao(customRole.getName()));
            }
        }
        csvUtils.exportToCsv("exportados/agentesComFuncao.csv", UserCsv.class, usersCsv);
    }

    private void geraCsvAdmins() throws InterruptedException, java.util.concurrent.ExecutionException, java.io.IOException {
        List<UserCsv> usersCsv = getUsersCsv(QUERY_ADMINS);
        csvUtils.exportToCsv("exportados/admins.csv", UserCsv.class, usersCsv);
    }

    public BigInteger getCountDaBuscaDeUsuarios(String query) {
        return zendeskAPI.searchUsers(query, 1).getCount();
    }


}
