package com.example.exporttocsvpoc.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSearchResult {
    List<UserSearched> results;
    Long count;
}
