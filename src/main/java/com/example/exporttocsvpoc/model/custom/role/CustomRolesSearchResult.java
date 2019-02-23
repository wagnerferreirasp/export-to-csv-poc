
package com.example.exporttocsvpoc.model.custom.role;

import java.math.BigInteger;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "custom_roles",
    "next_page",
    "previous_page",
    "count"
})
public class CustomRolesSearchResult {

    @JsonProperty("custom_roles")
    private List<CustomRole> customRoles = new ArrayList<CustomRole>();
    @JsonProperty("next_page")
    private String nextPage;
    @JsonProperty("previous_page")
    private String previousPage;
    @JsonProperty("count")
    private BigInteger count;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("custom_roles")
    public List<CustomRole> getCustomRoles() {
        return customRoles;
    }

    @JsonProperty("custom_roles")
    public void setCustomRoles(List<CustomRole> customRoles) {
        this.customRoles = customRoles;
    }

    @JsonProperty("next_page")
    public String getNextPage() {
        return nextPage;
    }

    @JsonProperty("next_page")
    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    @JsonProperty("previous_page")
    public String getPreviousPage() {
        return previousPage;
    }

    @JsonProperty("previous_page")
    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }

    @JsonProperty("count")
    public BigInteger getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(BigInteger count) {
        this.count = count;
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
        return new ToStringBuilder(this).append("customRoles", customRoles).append("nextPage", nextPage).append("previousPage", previousPage).append("count", count).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(previousPage).append(additionalProperties).append(nextPage).append(customRoles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomRolesSearchResult) == false) {
            return false;
        }
        CustomRolesSearchResult rhs = ((CustomRolesSearchResult) other);
        return new EqualsBuilder().append(count, rhs.count).append(previousPage, rhs.previousPage).append(additionalProperties, rhs.additionalProperties).append(nextPage, rhs.nextPage).append(customRoles, rhs.customRoles).isEquals();
    }

    public Optional<CustomRole> findById(String custom_role_id) {
        return customRoles.stream()
                .filter(c -> c.getId().toString().equals(custom_role_id))
                .findAny();
    }
}
