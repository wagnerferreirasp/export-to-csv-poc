
package com.example.exporttocsvpoc.model.custom.role;

import java.util.HashMap;
import java.util.Map;
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
    "chat_access",
    "manage_business_rules",
    "manage_dynamic_content",
    "manage_extensions_and_channels",
    "manage_facebook",
    "organization_editing",
    "organization_notes_editing",
    "ticket_deletion",
    "view_deleted_tickets",
    "ticket_tag_editing",
    "twitter_search_access",
    "forum_access_restricted_content",
    "end_user_list_access",
    "ticket_access",
    "ticket_comment_access",
    "voice_access",
    "moderate_forums",
    "group_access",
    "light_agent",
    "end_user_profile_access",
    "explore_access",
    "forum_access",
    "macro_access",
    "report_access",
    "ticket_editing",
    "ticket_merge",
    "view_access",
    "user_view_access"
})
public class Configuration {

    @JsonProperty("chat_access")
    private Boolean chatAccess;
    @JsonProperty("manage_business_rules")
    private Boolean manageBusinessRules;
    @JsonProperty("manage_dynamic_content")
    private Boolean manageDynamicContent;
    @JsonProperty("manage_extensions_and_channels")
    private Boolean manageExtensionsAndChannels;
    @JsonProperty("manage_facebook")
    private Boolean manageFacebook;
    @JsonProperty("organization_editing")
    private Boolean organizationEditing;
    @JsonProperty("organization_notes_editing")
    private Boolean organizationNotesEditing;
    @JsonProperty("ticket_deletion")
    private Boolean ticketDeletion;
    @JsonProperty("view_deleted_tickets")
    private Boolean viewDeletedTickets;
    @JsonProperty("ticket_tag_editing")
    private Boolean ticketTagEditing;
    @JsonProperty("twitter_search_access")
    private Boolean twitterSearchAccess;
    @JsonProperty("forum_access_restricted_content")
    private Boolean forumAccessRestrictedContent;
    @JsonProperty("end_user_list_access")
    private String endUserListAccess;
    @JsonProperty("ticket_access")
    private String ticketAccess;
    @JsonProperty("ticket_comment_access")
    private String ticketCommentAccess;
    @JsonProperty("voice_access")
    private Boolean voiceAccess;
    @JsonProperty("moderate_forums")
    private Boolean moderateForums;
    @JsonProperty("group_access")
    private Boolean groupAccess;
    @JsonProperty("light_agent")
    private Boolean lightAgent;
    @JsonProperty("end_user_profile_access")
    private String endUserProfileAccess;
    @JsonProperty("explore_access")
    private String exploreAccess;
    @JsonProperty("forum_access")
    private String forumAccess;
    @JsonProperty("macro_access")
    private String macroAccess;
    @JsonProperty("report_access")
    private String reportAccess;
    @JsonProperty("ticket_editing")
    private Boolean ticketEditing;
    @JsonProperty("ticket_merge")
    private Boolean ticketMerge;
    @JsonProperty("view_access")
    private String viewAccess;
    @JsonProperty("user_view_access")
    private String userViewAccess;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chat_access")
    public Boolean getChatAccess() {
        return chatAccess;
    }

    @JsonProperty("chat_access")
    public void setChatAccess(Boolean chatAccess) {
        this.chatAccess = chatAccess;
    }

    @JsonProperty("manage_business_rules")
    public Boolean getManageBusinessRules() {
        return manageBusinessRules;
    }

    @JsonProperty("manage_business_rules")
    public void setManageBusinessRules(Boolean manageBusinessRules) {
        this.manageBusinessRules = manageBusinessRules;
    }

    @JsonProperty("manage_dynamic_content")
    public Boolean getManageDynamicContent() {
        return manageDynamicContent;
    }

    @JsonProperty("manage_dynamic_content")
    public void setManageDynamicContent(Boolean manageDynamicContent) {
        this.manageDynamicContent = manageDynamicContent;
    }

    @JsonProperty("manage_extensions_and_channels")
    public Boolean getManageExtensionsAndChannels() {
        return manageExtensionsAndChannels;
    }

    @JsonProperty("manage_extensions_and_channels")
    public void setManageExtensionsAndChannels(Boolean manageExtensionsAndChannels) {
        this.manageExtensionsAndChannels = manageExtensionsAndChannels;
    }

    @JsonProperty("manage_facebook")
    public Boolean getManageFacebook() {
        return manageFacebook;
    }

    @JsonProperty("manage_facebook")
    public void setManageFacebook(Boolean manageFacebook) {
        this.manageFacebook = manageFacebook;
    }

    @JsonProperty("organization_editing")
    public Boolean getOrganizationEditing() {
        return organizationEditing;
    }

    @JsonProperty("organization_editing")
    public void setOrganizationEditing(Boolean organizationEditing) {
        this.organizationEditing = organizationEditing;
    }

    @JsonProperty("organization_notes_editing")
    public Boolean getOrganizationNotesEditing() {
        return organizationNotesEditing;
    }

    @JsonProperty("organization_notes_editing")
    public void setOrganizationNotesEditing(Boolean organizationNotesEditing) {
        this.organizationNotesEditing = organizationNotesEditing;
    }

    @JsonProperty("ticket_deletion")
    public Boolean getTicketDeletion() {
        return ticketDeletion;
    }

    @JsonProperty("ticket_deletion")
    public void setTicketDeletion(Boolean ticketDeletion) {
        this.ticketDeletion = ticketDeletion;
    }

    @JsonProperty("view_deleted_tickets")
    public Boolean getViewDeletedTickets() {
        return viewDeletedTickets;
    }

    @JsonProperty("view_deleted_tickets")
    public void setViewDeletedTickets(Boolean viewDeletedTickets) {
        this.viewDeletedTickets = viewDeletedTickets;
    }

    @JsonProperty("ticket_tag_editing")
    public Boolean getTicketTagEditing() {
        return ticketTagEditing;
    }

    @JsonProperty("ticket_tag_editing")
    public void setTicketTagEditing(Boolean ticketTagEditing) {
        this.ticketTagEditing = ticketTagEditing;
    }

    @JsonProperty("twitter_search_access")
    public Boolean getTwitterSearchAccess() {
        return twitterSearchAccess;
    }

    @JsonProperty("twitter_search_access")
    public void setTwitterSearchAccess(Boolean twitterSearchAccess) {
        this.twitterSearchAccess = twitterSearchAccess;
    }

    @JsonProperty("forum_access_restricted_content")
    public Boolean getForumAccessRestrictedContent() {
        return forumAccessRestrictedContent;
    }

    @JsonProperty("forum_access_restricted_content")
    public void setForumAccessRestrictedContent(Boolean forumAccessRestrictedContent) {
        this.forumAccessRestrictedContent = forumAccessRestrictedContent;
    }

    @JsonProperty("end_user_list_access")
    public String getEndUserListAccess() {
        return endUserListAccess;
    }

    @JsonProperty("end_user_list_access")
    public void setEndUserListAccess(String endUserListAccess) {
        this.endUserListAccess = endUserListAccess;
    }

    @JsonProperty("ticket_access")
    public String getTicketAccess() {
        return ticketAccess;
    }

    @JsonProperty("ticket_access")
    public void setTicketAccess(String ticketAccess) {
        this.ticketAccess = ticketAccess;
    }

    @JsonProperty("ticket_comment_access")
    public String getTicketCommentAccess() {
        return ticketCommentAccess;
    }

    @JsonProperty("ticket_comment_access")
    public void setTicketCommentAccess(String ticketCommentAccess) {
        this.ticketCommentAccess = ticketCommentAccess;
    }

    @JsonProperty("voice_access")
    public Boolean getVoiceAccess() {
        return voiceAccess;
    }

    @JsonProperty("voice_access")
    public void setVoiceAccess(Boolean voiceAccess) {
        this.voiceAccess = voiceAccess;
    }

    @JsonProperty("moderate_forums")
    public Boolean getModerateForums() {
        return moderateForums;
    }

    @JsonProperty("moderate_forums")
    public void setModerateForums(Boolean moderateForums) {
        this.moderateForums = moderateForums;
    }

    @JsonProperty("group_access")
    public Boolean getGroupAccess() {
        return groupAccess;
    }

    @JsonProperty("group_access")
    public void setGroupAccess(Boolean groupAccess) {
        this.groupAccess = groupAccess;
    }

    @JsonProperty("light_agent")
    public Boolean getLightAgent() {
        return lightAgent;
    }

    @JsonProperty("light_agent")
    public void setLightAgent(Boolean lightAgent) {
        this.lightAgent = lightAgent;
    }

    @JsonProperty("end_user_profile_access")
    public String getEndUserProfileAccess() {
        return endUserProfileAccess;
    }

    @JsonProperty("end_user_profile_access")
    public void setEndUserProfileAccess(String endUserProfileAccess) {
        this.endUserProfileAccess = endUserProfileAccess;
    }

    @JsonProperty("explore_access")
    public String getExploreAccess() {
        return exploreAccess;
    }

    @JsonProperty("explore_access")
    public void setExploreAccess(String exploreAccess) {
        this.exploreAccess = exploreAccess;
    }

    @JsonProperty("forum_access")
    public String getForumAccess() {
        return forumAccess;
    }

    @JsonProperty("forum_access")
    public void setForumAccess(String forumAccess) {
        this.forumAccess = forumAccess;
    }

    @JsonProperty("macro_access")
    public String getMacroAccess() {
        return macroAccess;
    }

    @JsonProperty("macro_access")
    public void setMacroAccess(String macroAccess) {
        this.macroAccess = macroAccess;
    }

    @JsonProperty("report_access")
    public String getReportAccess() {
        return reportAccess;
    }

    @JsonProperty("report_access")
    public void setReportAccess(String reportAccess) {
        this.reportAccess = reportAccess;
    }

    @JsonProperty("ticket_editing")
    public Boolean getTicketEditing() {
        return ticketEditing;
    }

    @JsonProperty("ticket_editing")
    public void setTicketEditing(Boolean ticketEditing) {
        this.ticketEditing = ticketEditing;
    }

    @JsonProperty("ticket_merge")
    public Boolean getTicketMerge() {
        return ticketMerge;
    }

    @JsonProperty("ticket_merge")
    public void setTicketMerge(Boolean ticketMerge) {
        this.ticketMerge = ticketMerge;
    }

    @JsonProperty("view_access")
    public String getViewAccess() {
        return viewAccess;
    }

    @JsonProperty("view_access")
    public void setViewAccess(String viewAccess) {
        this.viewAccess = viewAccess;
    }

    @JsonProperty("user_view_access")
    public String getUserViewAccess() {
        return userViewAccess;
    }

    @JsonProperty("user_view_access")
    public void setUserViewAccess(String userViewAccess) {
        this.userViewAccess = userViewAccess;
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
        return new ToStringBuilder(this).append("chatAccess", chatAccess).append("manageBusinessRules", manageBusinessRules).append("manageDynamicContent", manageDynamicContent).append("manageExtensionsAndChannels", manageExtensionsAndChannels).append("manageFacebook", manageFacebook).append("organizationEditing", organizationEditing).append("organizationNotesEditing", organizationNotesEditing).append("ticketDeletion", ticketDeletion).append("viewDeletedTickets", viewDeletedTickets).append("ticketTagEditing", ticketTagEditing).append("twitterSearchAccess", twitterSearchAccess).append("forumAccessRestrictedContent", forumAccessRestrictedContent).append("endUserListAccess", endUserListAccess).append("ticketAccess", ticketAccess).append("ticketCommentAccess", ticketCommentAccess).append("voiceAccess", voiceAccess).append("moderateForums", moderateForums).append("groupAccess", groupAccess).append("lightAgent", lightAgent).append("endUserProfileAccess", endUserProfileAccess).append("exploreAccess", exploreAccess).append("forumAccess", forumAccess).append("macroAccess", macroAccess).append("reportAccess", reportAccess).append("ticketEditing", ticketEditing).append("ticketMerge", ticketMerge).append("viewAccess", viewAccess).append("userViewAccess", userViewAccess).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(macroAccess).append(ticketDeletion).append(exploreAccess).append(viewDeletedTickets).append(ticketMerge).append(manageExtensionsAndChannels).append(manageDynamicContent).append(forumAccess).append(manageFacebook).append(ticketAccess).append(forumAccessRestrictedContent).append(groupAccess).append(userViewAccess).append(manageBusinessRules).append(organizationNotesEditing).append(twitterSearchAccess).append(lightAgent).append(ticketTagEditing).append(ticketCommentAccess).append(reportAccess).append(endUserListAccess).append(organizationEditing).append(moderateForums).append(chatAccess).append(ticketEditing).append(additionalProperties).append(voiceAccess).append(endUserProfileAccess).append(viewAccess).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Configuration) == false) {
            return false;
        }
        Configuration rhs = ((Configuration) other);
        return new EqualsBuilder().append(macroAccess, rhs.macroAccess).append(ticketDeletion, rhs.ticketDeletion).append(exploreAccess, rhs.exploreAccess).append(viewDeletedTickets, rhs.viewDeletedTickets).append(ticketMerge, rhs.ticketMerge).append(manageExtensionsAndChannels, rhs.manageExtensionsAndChannels).append(manageDynamicContent, rhs.manageDynamicContent).append(forumAccess, rhs.forumAccess).append(manageFacebook, rhs.manageFacebook).append(ticketAccess, rhs.ticketAccess).append(forumAccessRestrictedContent, rhs.forumAccessRestrictedContent).append(groupAccess, rhs.groupAccess).append(userViewAccess, rhs.userViewAccess).append(manageBusinessRules, rhs.manageBusinessRules).append(organizationNotesEditing, rhs.organizationNotesEditing).append(twitterSearchAccess, rhs.twitterSearchAccess).append(lightAgent, rhs.lightAgent).append(ticketTagEditing, rhs.ticketTagEditing).append(ticketCommentAccess, rhs.ticketCommentAccess).append(reportAccess, rhs.reportAccess).append(endUserListAccess, rhs.endUserListAccess).append(organizationEditing, rhs.organizationEditing).append(moderateForums, rhs.moderateForums).append(chatAccess, rhs.chatAccess).append(ticketEditing, rhs.ticketEditing).append(additionalProperties, rhs.additionalProperties).append(voiceAccess, rhs.voiceAccess).append(endUserProfileAccess, rhs.endUserProfileAccess).append(viewAccess, rhs.viewAccess).isEquals();
    }

}
