
package com.example.exporttocsvpoc.model.user;

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
    "classificao",
    "cliente_contumaz",
    "codigo_interno_bgn",
    "cpf_cnpj",
    "e_mail_de_cobrana",
    "inscrio_estadual",
    "inscrio_municipal",
    "login",
    "natureza",
    "nome_razo_social",
    "segmento",
    "tipos_de_endereo",
    "tipo_do_cliente"
})
public class UserFields {

    @JsonProperty("classificao")
    private String classificao;
    @JsonProperty("cliente_contumaz")
    private Boolean clienteContumaz;
    @JsonProperty("codigo_interno_bgn")
    private String codigoInternoBgn;
    @JsonProperty("cpf_cnpj")
    private String cpfCnpj;
    @JsonProperty("e_mail_de_cobrana")
    private String eMailDeCobrana;
    @JsonProperty("inscrio_estadual")
    private String inscrioEstadual;
    @JsonProperty("inscrio_municipal")
    private String inscrioMunicipal;
    @JsonProperty("login")
    private String login;
    @JsonProperty("natureza")
    private String natureza;
    @JsonProperty("nome_razo_social")
    private String nomeRazoSocial;
    @JsonProperty("segmento")
    private String segmento;
    @JsonProperty("tipos_de_endereo")
    private String tiposDeEndereo;
    @JsonProperty("tipo_do_cliente")
    private String tipoDoCliente;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("classificao")
    public String getClassificao() {
        return classificao;
    }

    @JsonProperty("classificao")
    public void setClassificao(String classificao) {
        this.classificao = classificao;
    }

    @JsonProperty("cliente_contumaz")
    public Boolean getClienteContumaz() {
        return clienteContumaz;
    }

    @JsonProperty("cliente_contumaz")
    public void setClienteContumaz(Boolean clienteContumaz) {
        this.clienteContumaz = clienteContumaz;
    }

    @JsonProperty("codigo_interno_bgn")
    public String getCodigoInternoBgn() {
        return codigoInternoBgn;
    }

    @JsonProperty("codigo_interno_bgn")
    public void setCodigoInternoBgn(String codigoInternoBgn) {
        this.codigoInternoBgn = codigoInternoBgn;
    }

    @JsonProperty("cpf_cnpj")
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    @JsonProperty("cpf_cnpj")
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @JsonProperty("e_mail_de_cobrana")
    public String getEMailDeCobrana() {
        return eMailDeCobrana;
    }

    @JsonProperty("e_mail_de_cobrana")
    public void setEMailDeCobrana(String eMailDeCobrana) {
        this.eMailDeCobrana = eMailDeCobrana;
    }

    @JsonProperty("inscrio_estadual")
    public String getInscrioEstadual() {
        return inscrioEstadual;
    }

    @JsonProperty("inscrio_estadual")
    public void setInscrioEstadual(String inscrioEstadual) {
        this.inscrioEstadual = inscrioEstadual;
    }

    @JsonProperty("inscrio_municipal")
    public String getInscrioMunicipal() {
        return inscrioMunicipal;
    }

    @JsonProperty("inscrio_municipal")
    public void setInscrioMunicipal(String inscrioMunicipal) {
        this.inscrioMunicipal = inscrioMunicipal;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("natureza")
    public String getNatureza() {
        return natureza;
    }

    @JsonProperty("natureza")
    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    @JsonProperty("nome_razo_social")
    public String getNomeRazoSocial() {
        return nomeRazoSocial;
    }

    @JsonProperty("nome_razo_social")
    public void setNomeRazoSocial(String nomeRazoSocial) {
        this.nomeRazoSocial = nomeRazoSocial;
    }

    @JsonProperty("segmento")
    public String getSegmento() {
        return segmento;
    }

    @JsonProperty("segmento")
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @JsonProperty("tipos_de_endereo")
    public String getTiposDeEndereo() {
        return tiposDeEndereo;
    }

    @JsonProperty("tipos_de_endereo")
    public void setTiposDeEndereo(String tiposDeEndereo) {
        this.tiposDeEndereo = tiposDeEndereo;
    }

    @JsonProperty("tipo_do_cliente")
    public String getTipoDoCliente() {
        return tipoDoCliente;
    }

    @JsonProperty("tipo_do_cliente")
    public void setTipoDoCliente(String tipoDoCliente) {
        this.tipoDoCliente = tipoDoCliente;
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
        return new ToStringBuilder(this).append("classificao", classificao).append("clienteContumaz", clienteContumaz).append("codigoInternoBgn", codigoInternoBgn).append("cpfCnpj", cpfCnpj).append("eMailDeCobrana", eMailDeCobrana).append("inscrioEstadual", inscrioEstadual).append("inscrioMunicipal", inscrioMunicipal).append("login", login).append("natureza", natureza).append("nomeRazoSocial", nomeRazoSocial).append("segmento", segmento).append("tiposDeEndereo", tiposDeEndereo).append("tipoDoCliente", tipoDoCliente).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clienteContumaz).append(tiposDeEndereo).append(inscrioMunicipal).append(inscrioEstadual).append(login).append(tipoDoCliente).append(segmento).append(nomeRazoSocial).append(codigoInternoBgn).append(classificao).append(eMailDeCobrana).append(cpfCnpj).append(natureza).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserFields) == false) {
            return false;
        }
        UserFields rhs = ((UserFields) other);
        return new EqualsBuilder().append(clienteContumaz, rhs.clienteContumaz).append(tiposDeEndereo, rhs.tiposDeEndereo).append(inscrioMunicipal, rhs.inscrioMunicipal).append(inscrioEstadual, rhs.inscrioEstadual).append(login, rhs.login).append(tipoDoCliente, rhs.tipoDoCliente).append(segmento, rhs.segmento).append(nomeRazoSocial, rhs.nomeRazoSocial).append(codigoInternoBgn, rhs.codigoInternoBgn).append(classificao, rhs.classificao).append(eMailDeCobrana, rhs.eMailDeCobrana).append(cpfCnpj, rhs.cpfCnpj).append(natureza, rhs.natureza).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
