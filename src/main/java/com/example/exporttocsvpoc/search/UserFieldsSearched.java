package com.example.exporttocsvpoc.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserFieldsSearched {
    String cpf_cnpj;
    String login;
    String nome_razo_social;
}
