package br.com.pedrodavi.batch.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiariosGroup", propOrder = {
    "cpfOrCnpj"
})
public class BeneficiariosGroup {

    @XmlElementRefs({
        @XmlElementRef(name = "cpf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cnpj", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> cpfOrCnpj;


    public List<JAXBElement<String>> getCpfOrCnpj() {
        if (cpfOrCnpj == null) {
            cpfOrCnpj = new ArrayList<JAXBElement<String>>();
        }
        return this.cpfOrCnpj;
    }

}
