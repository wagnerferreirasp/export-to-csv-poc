package com.example.exporttocsvpoc.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomRolesSearchResult {
    @Getter
    List<CustomRoleSearched> custom_roles;
    private HashMap<String, CustomRoleSearched> customRoleSearchedHashMap = new HashMap<>();

    public void setCustom_roles(List<CustomRoleSearched> custom_roles) {
        this.custom_roles = custom_roles;
        custom_roles.forEach(role -> customRoleSearchedHashMap.put(role.id, role));
    }

    public String findById(String id) {
        CustomRoleSearched customRoleSearched = customRoleSearchedHashMap.get(id);
        return customRoleSearched.name;
    }
}
