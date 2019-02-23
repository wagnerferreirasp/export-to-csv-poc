package com.example.exporttocsvpoc.utils;

import com.example.exporttocsvpoc.model.user.UserSearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.stream.Collectors.toList;

@Component
public class AsyncUtils {
    @Autowired
    ZendeskAPI zendeskAPI;

    public <T> CompletableFuture<List<T>> sequence(List<CompletableFuture<T>> list) {
        return CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()]))
                .thenApply(v -> list.stream()
                        .map(CompletableFuture::join)
                        .collect(toList())
                );
    }

    @Async
    public CompletableFuture<UserSearchResult> buscaUsuariosAsync(String query, int page) {
        UserSearchResult userSearchResult = zendeskAPI.searchUsers(query, page);
        return CompletableFuture.completedFuture(userSearchResult);
    }
}
