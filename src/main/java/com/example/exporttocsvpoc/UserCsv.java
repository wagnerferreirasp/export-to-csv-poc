package com.example.exporttocsvpoc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"id", "nome", "email", "cpf", "login", "funcao", "nome_razo_social", "ativo"})
public class UserCsv {
    String id;
    String nome;
    String email;
    String funcao;
    String cpf;
    String login;
    Boolean ativo;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String custom_role_id;
    String nome_razo_social;
}
