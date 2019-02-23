package com.example.exporttocsvpoc;

import com.example.exporttocsvpoc.model.ticket.TicketForm;
import com.example.exporttocsvpoc.model.ticket.TicketFormPut;
import com.example.exporttocsvpoc.utils.ZendeskAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BulkUpdates {
    @Value("${fields.fraud}")
    String fieldFraude;
    final Logger logger = LoggerFactory.getLogger(BulkUpdates.class);

    @Autowired
    ZendeskAPI zendeskAPI;

    public void atualizaFormsComFieldNecessario() {
        List<TicketForm> allTicketForms = zendeskAPI.getTicketFormsSearch().getTicketForms();
        List<TicketFormPut> formsToUpdate = allTicketForms
                .stream()
                .filter(t -> t.getName().equalsIgnoreCase("Anatel"))
                .filter(t -> !t.getTicketFieldIds().contains(new BigInteger(fieldFraude)))
                .peek(t -> t.getTicketFieldIds().add(new BigInteger(fieldFraude)))
                .map(t -> {
                    TicketForm ticketForm = new TicketForm();
                    ticketForm.setId(t.getId());
                    ticketForm.setName(t.getName());
                    ticketForm.setTicketFieldIds(t.getTicketFieldIds());
                    TicketFormPut ticketFormPut = new TicketFormPut();
                    ticketFormPut.setTicketForm(ticketForm);
                    return ticketFormPut;
                })
                .collect(Collectors.toList());

        formsToUpdate.forEach(ticketFormPut -> {
            logger.info("ticketFormId: " + ticketFormPut.getTicketForm().getId());
            try {
                zendeskAPI.updateTicketForm(ticketFormPut.getTicketForm().getId(), ticketFormPut);
            } catch (HttpClientErrorException | HttpServerErrorException e) {
                logger.warn(
                        "Exception no formId " + ticketFormPut.getTicketForm().getId(), e
                );
            }
        });
    }

}
