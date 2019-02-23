
package com.example.exporttocsvpoc.model.ticket;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ticket_forms"
})
public class TicketFormsSearch {

    @JsonProperty("ticket_forms")
    private List<TicketForm> ticketForms = new ArrayList<TicketForm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ticket_forms")
    public List<TicketForm> getTicketForms() {
        return ticketForms;
    }

    @JsonProperty("ticket_forms")
    public void setTicketForms(List<TicketForm> ticketForms) {
        this.ticketForms = ticketForms;
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
        return new ToStringBuilder(this).append("ticketForms", ticketForms).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ticketForms).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicketFormsSearch) == false) {
            return false;
        }
        TicketFormsSearch rhs = ((TicketFormsSearch) other);
        return new EqualsBuilder().append(ticketForms, rhs.ticketForms).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
