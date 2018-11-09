package com.example.exporttocsvpoc;

import com.example.exporttocsvpoc.search.CustomRolesSearchResult;
import com.example.exporttocsvpoc.search.UserSearchResult;
import com.json.generated.TicketFormPut;
import com.json.generated.TicketFormsSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

@Service
public class ZendeskService {
    @Value("/api/v2/search.json?query={query}&page={page}")
    String ENDPOINT_SEARCH_WITH_PAGE;
    @Value("/api/v2/ticket_forms/{id}.json")
    String ENDPOINT_UPDATE_TICKET_FORMS;
    @Value("/api/v2/ticket_forms.json")
    String ENDPOINT_LIST_TICKET_FORMS;
    @Value("/api/v2/custom_roles.json")
    String ENDPOINT_CUSTOM_ROLES;

    @Autowired
    RestTemplate restTemplate;

    public TicketFormsSearch ticketForms() {
        return restTemplate
                .getForEntity(ENDPOINT_LIST_TICKET_FORMS, TicketFormsSearch.class)
                .getBody();
    }

    @Async
    CompletableFuture<UserSearchResult> buscaUsuarios(String query, int page) {
        HashMap<String, Object> variables = new HashMap<>();
        variables.put("query", query);
        variables.put("page", 1);
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(ENDPOINT_SEARCH_WITH_PAGE).build();
        uriComponents = uriComponents.expand(variables);
        ResponseEntity<UserSearchResult> resultResponseEntity = restTemplate.getForEntity(uriComponents.toString(), UserSearchResult.class);
        return CompletableFuture.completedFuture(resultResponseEntity.getBody());
    }

    public CustomRolesSearchResult buscaFuncoes() {
        return restTemplate
                .getForEntity(ENDPOINT_CUSTOM_ROLES, CustomRolesSearchResult.class)
                .getBody();
    }

    @Async
    public void mudaTicketForm(TicketFormPut ticketFormPut) {
        HttpEntity<TicketFormPut> entity = new HttpEntity<TicketFormPut>(ticketFormPut);
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(ENDPOINT_UPDATE_TICKET_FORMS).build();
        restTemplate.put(
                uriComponents.expand(ticketFormPut.getTicketForm().getId()).toString(),
                entity
        );
    }

    public Long getCountDaBuscaDeUsuarios(String query) {
        HashMap<String, Object> variables = new HashMap<>();
        variables.put("query", query);
        variables.put("page", 1);
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(ENDPOINT_SEARCH_WITH_PAGE).build();
        uriComponents = uriComponents.expand(variables);

        return restTemplate
                .getForEntity(uriComponents.toString(), UserSearchResult.class)
                .getBody()
                .getCount();
    }
}
