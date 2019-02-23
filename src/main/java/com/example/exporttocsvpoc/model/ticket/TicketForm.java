
package com.example.exporttocsvpoc.model.ticket;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "ticket_field_ids"
})
public class TicketForm {

    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ticket_field_ids")
    private List<BigInteger> ticketFieldIds = new ArrayList<BigInteger>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public BigInteger getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ticket_field_ids")
    public List<BigInteger> getTicketFieldIds() {
        return ticketFieldIds;
    }

    @JsonProperty("ticket_field_ids")
    public void setTicketFieldIds(List<BigInteger> ticketFieldIds) {
        this.ticketFieldIds = ticketFieldIds;
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
        return new ToStringBuilder(this).append("id", id).append("name", name).append("ticketFieldIds", ticketFieldIds).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(additionalProperties).append(ticketFieldIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicketForm) == false) {
            return false;
        }
        TicketForm rhs = ((TicketForm) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(ticketFieldIds, rhs.ticketFieldIds).isEquals();
    }

}
