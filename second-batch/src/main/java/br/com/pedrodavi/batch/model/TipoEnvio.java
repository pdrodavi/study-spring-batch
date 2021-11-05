package br.com.pedrodavi.batch.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "tipoEnvio")
@XmlEnum
public enum TipoEnvio {


    /**
     * Inclus�o de um novo arquivo
     * 
     */
    I,

    /**
     * Substitui��o de arquivo existente.
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static TipoEnvio fromValue(String v) {
        return valueOf(v);
    }

}
