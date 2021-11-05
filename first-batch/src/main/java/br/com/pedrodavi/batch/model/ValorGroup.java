package br.com.pedrodavi.batch.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valorGroup", propOrder = {
    "id",
    "beneficiarios",
    "valorADevolver",
    "codOrigem",
    "infAdicionais"
})
public class ValorGroup {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected BeneficiariosGroup beneficiarios;
    @XmlElement(required = true)
    protected BigDecimal valorADevolver;
    @XmlElement(required = true)
    protected String codOrigem;
    protected String infAdicionais;


    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public BeneficiariosGroup getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(BeneficiariosGroup value) {
        this.beneficiarios = value;
    }

    public BigDecimal getValorADevolver() {
        return valorADevolver;
    }

    public void setValorADevolver(BigDecimal value) {
        this.valorADevolver = value;
    }

    public String getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(String value) {
        this.codOrigem = value;
    }

    public String getInfAdicionais() {
        return infAdicionais;
    }

    public void setInfAdicionais(String value) {
        this.infAdicionais = value;
    }

}
