package com.example.exporttocsvpoc.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomRoleSearched {
    String id;
    String name;
}
