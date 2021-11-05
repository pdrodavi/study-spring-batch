package br.com.pedrodavi.batch.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@XmlRootElement(name="value")
public class Value {

    private int NR_SEQ_DEVOL;
    private String ID_VALOR_DEVOL;
    private int NR_CONTA_CTBL;
    private int NR_CENTRO_DEST;
    private Date DATA_CTBL;
    private double VALOR_DEVOL;
    private String DETAL_OCORR;
    private int NR_EMPR;
    private int NR_CNPJ_BASE;
    private int NR_AGENCIA;
    private int NR_CONTRATO;
    private String NR_DOCT_CLI;
    private String NM_CLI;
    private String NM_PRODUTO;
    private String NR_TEL_CLI;
    private String NM_EMAIL_CLI;
    private int COD_ORIG_DEVOL;
    private Date DT_REF_ARQ;
    private Date DT_ENVIO_BCB;
    private String NM_ARQ_ORI;

}
