package br.com.pedrodavi.batch.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asvr9800Group", propOrder = {
    "codDoc",
    "tipoEnvio",
    "dataBase",
    "cnpjIf",
    "semValores",
    "valor"
})
public class Asvr9800Group {

    @XmlElement(required = true)
    protected String codDoc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoEnvio tipoEnvio;
    @XmlElement(required = true)
    protected String dataBase;
    @XmlElement(required = true)
    protected String cnpjIf;
    protected Vazio semValores;
    protected List<ValorGroup> valor;


    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String value) {
        this.codDoc = value;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio value) {
        this.tipoEnvio = value;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String value) {
        this.dataBase = value;
    }

    public String getCnpjIf() {
        return cnpjIf;
    }

    public void setCnpjIf(String value) {
        this.cnpjIf = value;
    }

    public Vazio getSemValores() {
        return semValores;
    }

    public void setSemValores(Vazio value) {
        this.semValores = value;
    }

    public List<ValorGroup> getValor() {
        if (valor == null) {
            valor = new ArrayList<ValorGroup>();
        }
        return this.valor;
    }

}
