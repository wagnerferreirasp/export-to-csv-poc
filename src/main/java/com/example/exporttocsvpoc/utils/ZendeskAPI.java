package com.example.exporttocsvpoc.utils;

import com.example.exporttocsvpoc.model.custom.role.CustomRolesSearchResult;
import com.example.exporttocsvpoc.model.ticket.TicketFormPut;
import com.example.exporttocsvpoc.model.ticket.TicketFormsSearch;
import com.example.exporttocsvpoc.model.user.UserSearchResult;
import feign.Param;
import feign.RequestLine;

import java.math.BigInteger;

public interface ZendeskAPI {
    @RequestLine("GET /api/v2/ticket_forms.json")
    TicketFormsSearch getTicketFormsSearch();

    @RequestLine("GET /api/v2/search.json?query={query}&page={page}")
    UserSearchResult searchUsers(@Param("query") String query, @Param("page") int page);

    @RequestLine("GET /api/v2/custom_roles.json")
    CustomRolesSearchResult getCustomRolesSearch();

    @RequestLine("PUT /api/v2/ticket_forms/{id}.json")
    void updateTicketForm(@Param("id") BigInteger id, TicketFormPut ticketFormRequest);
}
