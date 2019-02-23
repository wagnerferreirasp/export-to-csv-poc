
package com.example.exporttocsvpoc.model.ticket;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ticket_form"
})
public class TicketFormPut {

    @JsonProperty("ticket_form")
    private TicketForm ticketForm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ticket_form")
    public TicketForm getTicketForm() {
        return ticketForm;
    }

    @JsonProperty("ticket_form")
    public void setTicketForm(TicketForm ticketForm) {
        this.ticketForm = ticketForm;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ticketForm", ticketForm).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ticketForm).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicketFormPut) == false) {
            return false;
        }
        TicketFormPut rhs = ((TicketFormPut) other);
        return new EqualsBuilder().append(ticketForm, rhs.ticketForm).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
