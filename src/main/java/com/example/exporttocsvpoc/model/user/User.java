
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
    "id",
    "url",
    "name",
    "email",
    "created_at",
    "updated_at",
    "time_zone",
    "iana_time_zone",
    "phone",
    "shared_phone_number",
    "photo",
    "locale_id",
    "locale",
    "organization_id",
    "role",
    "verified",
    "external_id",
    "tags",
    "alias",
    "active",
    "shared",
    "shared_agent",
    "last_login_at",
    "two_factor_auth_enabled",
    "signature",
    "details",
    "notes",
    "role_type",
    "custom_role_id",
    "moderator",
    "ticket_restriction",
    "only_private_comments",
    "restricted_agent",
    "suspended",
    "chat_only",
    "default_group_id",
    "report_csv",
    "user_fields",
    "result_type"
})
public class User {

    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("iana_time_zone")
    private String ianaTimeZone;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("shared_phone_number")
    private String sharedPhoneNumber;
    @JsonProperty("photo")
    private Object photo;
    @JsonProperty("locale_id")
    private BigInteger localeId;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("organization_id")
    private BigInteger organizationId;
    @JsonProperty("role")
    private String role;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("external_id")
    private String externalId;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("shared_agent")
    private Boolean sharedAgent;
    @JsonProperty("last_login_at")
    private String lastLoginAt;
    @JsonProperty("two_factor_auth_enabled")
    private Boolean twoFactorAuthEnabled;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("details")
    private String details;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("role_type")
    private String roleType;
    @JsonProperty("custom_role_id")
    private BigInteger customRoleId;
    @JsonProperty("moderator")
    private Boolean moderator;
    @JsonProperty("ticket_restriction")
    private String ticketRestriction;
    @JsonProperty("only_private_comments")
    private Boolean onlyPrivateComments;
    @JsonProperty("restricted_agent")
    private Boolean restrictedAgent;
    @JsonProperty("suspended")
    private Boolean suspended;
    @JsonProperty("chat_only")
    private Boolean chatOnly;
    @JsonProperty("default_group_id")
    private BigInteger defaultGroupId;
    @JsonProperty("report_csv")
    private Boolean reportCsv;
    @JsonProperty("user_fields")
    private UserFields userFields;
    @JsonProperty("result_type")
    private String resultType;
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

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("iana_time_zone")
    public String getIanaTimeZone() {
        return ianaTimeZone;
    }

    @JsonProperty("iana_time_zone")
    public void setIanaTimeZone(String ianaTimeZone) {
        this.ianaTimeZone = ianaTimeZone;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("shared_phone_number")
    public String getSharedPhoneNumber() {
        return sharedPhoneNumber;
    }

    @JsonProperty("shared_phone_number")
    public void setSharedPhoneNumber(String sharedPhoneNumber) {
        this.sharedPhoneNumber = sharedPhoneNumber;
    }

    @JsonProperty("photo")
    public Object getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    @JsonProperty("locale_id")
    public BigInteger getLocaleId() {
        return localeId;
    }

    @JsonProperty("locale_id")
    public void setLocaleId(BigInteger localeId) {
        this.localeId = localeId;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("organization_id")
    public BigInteger getOrganizationId() {
        return organizationId;
    }

    @JsonProperty("organization_id")
    public void setOrganizationId(BigInteger organizationId) {
        this.organizationId = organizationId;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @JsonProperty("shared_agent")
    public Boolean getSharedAgent() {
        return sharedAgent;
    }

    @JsonProperty("shared_agent")
    public void setSharedAgent(Boolean sharedAgent) {
        this.sharedAgent = sharedAgent;
    }

    @JsonProperty("last_login_at")
    public String getLastLoginAt() {
        return lastLoginAt;
    }

    @JsonProperty("last_login_at")
    public void setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    @JsonProperty("two_factor_auth_enabled")
    public Boolean getTwoFactorAuthEnabled() {
        return twoFactorAuthEnabled;
    }

    @JsonProperty("two_factor_auth_enabled")
    public void setTwoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
        this.twoFactorAuthEnabled = twoFactorAuthEnabled;
    }

    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("role_type")
    public String getRoleType() {
        return roleType;
    }

    @JsonProperty("role_type")
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @JsonProperty("custom_role_id")
    public BigInteger getCustomRoleId() {
        return customRoleId;
    }

    @JsonProperty("custom_role_id")
    public void setCustomRoleId(BigInteger customRoleId) {
        this.customRoleId = customRoleId;
    }

    @JsonProperty("moderator")
    public Boolean getModerator() {
        return moderator;
    }

    @JsonProperty("moderator")
    public void setModerator(Boolean moderator) {
        this.moderator = moderator;
    }

    @JsonProperty("ticket_restriction")
    public String getTicketRestriction() {
        return ticketRestriction;
    }

    @JsonProperty("ticket_restriction")
    public void setTicketRestriction(String ticketRestriction) {
        this.ticketRestriction = ticketRestriction;
    }

    @JsonProperty("only_private_comments")
    public Boolean getOnlyPrivateComments() {
        return onlyPrivateComments;
    }

    @JsonProperty("only_private_comments")
    public void setOnlyPrivateComments(Boolean onlyPrivateComments) {
        this.onlyPrivateComments = onlyPrivateComments;
    }

    @JsonProperty("restricted_agent")
    public Boolean getRestrictedAgent() {
        return restrictedAgent;
    }

    @JsonProperty("restricted_agent")
    public void setRestrictedAgent(Boolean restrictedAgent) {
        this.restrictedAgent = restrictedAgent;
    }

    @JsonProperty("suspended")
    public Boolean getSuspended() {
        return suspended;
    }

    @JsonProperty("suspended")
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    @JsonProperty("chat_only")
    public Boolean getChatOnly() {
        return chatOnly;
    }

    @JsonProperty("chat_only")
    public void setChatOnly(Boolean chatOnly) {
        this.chatOnly = chatOnly;
    }

    @JsonProperty("default_group_id")
    public BigInteger getDefaultGroupId() {
        return defaultGroupId;
    }

    @JsonProperty("default_group_id")
    public void setDefaultGroupId(BigInteger defaultGroupId) {
        this.defaultGroupId = defaultGroupId;
    }

    @JsonProperty("report_csv")
    public Boolean getReportCsv() {
        return reportCsv;
    }

    @JsonProperty("report_csv")
    public void setReportCsv(Boolean reportCsv) {
        this.reportCsv = reportCsv;
    }

    @JsonProperty("user_fields")
    public UserFields getUserFields() {
        return userFields;
    }

    @JsonProperty("user_fields")
    public void setUserFields(UserFields userFields) {
        this.userFields = userFields;
    }

    @JsonProperty("result_type")
    public String getResultType() {
        return resultType;
    }

    @JsonProperty("result_type")
    public void setResultType(String resultType) {
        this.resultType = resultType;
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
        return new ToStringBuilder(this).append("id", id).append("url", url).append("name", name).append("email", email).append("createdAt", createdAt).append("updatedAt", updatedAt).append("timeZone", timeZone).append("ianaTimeZone", ianaTimeZone).append("phone", phone).append("sharedPhoneNumber", sharedPhoneNumber).append("photo", photo).append("localeId", localeId).append("locale", locale).append("organizationId", organizationId).append("role", role).append("verified", verified).append("externalId", externalId).append("tags", tags).append("alias", alias).append("active", active).append("shared", shared).append("sharedAgent", sharedAgent).append("lastLoginAt", lastLoginAt).append("twoFactorAuthEnabled", twoFactorAuthEnabled).append("signature", signature).append("details", details).append("notes", notes).append("roleType", roleType).append("customRoleId", customRoleId).append("moderator", moderator).append("ticketRestriction", ticketRestriction).append("onlyPrivateComments", onlyPrivateComments).append("restrictedAgent", restrictedAgent).append("suspended", suspended).append("chatOnly", chatOnly).append("defaultGroupId", defaultGroupId).append("reportCsv", reportCsv).append("userFields", userFields).append("resultType", resultType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shared).append(reportCsv).append(role).append(notes).append(signature).append(moderator).append(ianaTimeZone).append(ticketRestriction).append(defaultGroupId).append(onlyPrivateComments).append(locale).append(roleType).append(chatOnly).append(organizationId).append(createdAt).append(twoFactorAuthEnabled).append(alias).append(details).append(id).append(customRoleId).append(resultType).append(email).append(localeId).append(updatedAt).append(sharedAgent).append(verified).append(timeZone).append(photo).append(externalId).append(active).append(url).append(sharedPhoneNumber).append(suspended).append(tags).append(restrictedAgent).append(userFields).append(lastLoginAt).append(phone).append(name).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(shared, rhs.shared).append(reportCsv, rhs.reportCsv).append(role, rhs.role).append(notes, rhs.notes).append(signature, rhs.signature).append(moderator, rhs.moderator).append(ianaTimeZone, rhs.ianaTimeZone).append(ticketRestriction, rhs.ticketRestriction).append(defaultGroupId, rhs.defaultGroupId).append(onlyPrivateComments, rhs.onlyPrivateComments).append(locale, rhs.locale).append(roleType, rhs.roleType).append(chatOnly, rhs.chatOnly).append(organizationId, rhs.organizationId).append(createdAt, rhs.createdAt).append(twoFactorAuthEnabled, rhs.twoFactorAuthEnabled).append(alias, rhs.alias).append(details, rhs.details).append(id, rhs.id).append(customRoleId, rhs.customRoleId).append(resultType, rhs.resultType).append(email, rhs.email).append(localeId, rhs.localeId).append(updatedAt, rhs.updatedAt).append(sharedAgent, rhs.sharedAgent).append(verified, rhs.verified).append(timeZone, rhs.timeZone).append(photo, rhs.photo).append(externalId, rhs.externalId).append(active, rhs.active).append(url, rhs.url).append(sharedPhoneNumber, rhs.sharedPhoneNumber).append(suspended, rhs.suspended).append(tags, rhs.tags).append(restrictedAgent, rhs.restrictedAgent).append(userFields, rhs.userFields).append(lastLoginAt, rhs.lastLoginAt).append(phone, rhs.phone).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public UserCsv toUserCsv() {
        UserCsv userCsv = new UserCsv();
        userCsv.setAtivo(this.active);
        userCsv.setCpf(this.userFields.getCpfCnpj());
        userCsv.setCustom_role_id(this.customRoleId.toString());
        userCsv.setEmail(this.getEmail());
        userCsv.setLogin(this.userFields.getLogin());
        userCsv.setNome(this.name);
        userCsv.setId(this.id.toString());
        userCsv.setNome_razo_social(this.userFields.getNomeRazoSocial());
        return userCsv;
    }

}
