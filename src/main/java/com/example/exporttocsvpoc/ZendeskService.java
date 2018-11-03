package com.example.exporttocsvpoc;

import com.example.exporttocsvpoc.search.CustomRolesSearchResult;
import com.example.exporttocsvpoc.search.UserSearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

@Service
public class ZendeskService {
    @Value("${server.url}")
    String baseUrl;
    @Value("${endpoints.busca1}")
    String endpointBusca1;
    @Value("${endpoints.customRoles}")
    String endpointCustomRoles;

    @Autowired
    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(ZendeskService.class);

    @Async
    CompletableFuture<UserSearchResult> buscaUsuarios(int page) {
        logger.info("Buscando página " + page);
        String url = baseUrl + endpointBusca1 + "&page=" + page;
        ResponseEntity<UserSearchResult> resultResponseEntity = restTemplate.getForEntity(URI.create(url), UserSearchResult.class);
        return CompletableFuture.completedFuture(resultResponseEntity.getBody());
    }

    public CustomRolesSearchResult buscaFuncoes() {
        String url = baseUrl + endpointCustomRoles;
        return restTemplate.getForEntity(URI.create(url), CustomRolesSearchResult.class).getBody();
    }

    public Long getCountBusca1() {
        String url = baseUrl + endpointBusca1;
        ResponseEntity<UserSearchResult> resultResponseEntity = restTemplate.getForEntity(URI.create(url), UserSearchResult.class);
        return resultResponseEntity.getBody().getCount();
    }
}
