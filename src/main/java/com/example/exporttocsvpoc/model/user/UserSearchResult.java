
package com.example.exporttocsvpoc.model.user;

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
    "results",
    "facets",
    "next_page",
    "previous_page",
    "count"
})
public class UserSearchResult {

    @JsonProperty("results")
    private List<User> results = new ArrayList<User>();
    @JsonProperty("facets")
    private Object facets;
    @JsonProperty("next_page")
    private String nextPage;
    @JsonProperty("previous_page")
    private Object previousPage;
    @JsonProperty("count")
    private BigInteger count;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public List<User> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<User> results) {
        this.results = results;
    }

    @JsonProperty("facets")
    public Object getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(Object facets) {
        this.facets = facets;
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
    public Object getPreviousPage() {
        return previousPage;
    }

    @JsonProperty("previous_page")
    public void setPreviousPage(Object previousPage) {
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
        return new ToStringBuilder(this).append("results", results).append("facets", facets).append("nextPage", nextPage).append("previousPage", previousPage).append("count", count).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(previousPage).append(nextPage).append(count).append(additionalProperties).append(results).append(facets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserSearchResult) == false) {
            return false;
        }
        UserSearchResult rhs = ((UserSearchResult) other);
        return new EqualsBuilder().append(previousPage, rhs.previousPage).append(nextPage, rhs.nextPage).append(count, rhs.count).append(additionalProperties, rhs.additionalProperties).append(results, rhs.results).append(facets, rhs.facets).isEquals();
    }

}
