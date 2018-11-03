package com.example.exporttocsvpoc.search;

import com.example.exporttocsvpoc.UserCsv;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSearched {
    String id;
    String name;
    String email;
    String custom_role_id;
    Boolean active;
    UserFieldsSearched user_fields;

    public UserCsv toUser() {
        UserCsv userCsv = new UserCsv();
        userCsv.setId(this.id);
        userCsv.setNome(this.name);
        userCsv.setEmail(this.email);
        userCsv.setCustom_role_id(this.custom_role_id);
        userCsv.setAtivo(this.active);
        userCsv.setCpf(this.user_fields.cpf_cnpj);
        userCsv.setLogin(this.user_fields.login);
        return userCsv;
    }
}
