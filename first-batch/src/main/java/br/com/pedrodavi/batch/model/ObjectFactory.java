package br.com.pedrodavi.batch.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _Asvr9800_QNAME = new QName("", "asvr9800");
    private final static QName _BeneficiariosGroupCpf_QNAME = new QName("", "cpf");
    private final static QName _BeneficiariosGroupCnpj_QNAME = new QName("", "cnpj");

    public ObjectFactory() {
    }

    public Asvr9800Group createAsvr9800Group() {
        return new Asvr9800Group();
    }

    public Vazio createVazio() {
        return new Vazio();
    }

    public ValorGroup createValorGroup() {
        return new ValorGroup();
    }

    public BeneficiariosGroup createBeneficiariosGroup() {
        return new BeneficiariosGroup();
    }

    @XmlElementDecl(namespace = "", name = "asvr9800")
    public JAXBElement<Asvr9800Group> createAsvr9800(Asvr9800Group value) {
        return new JAXBElement<Asvr9800Group>(_Asvr9800_QNAME, Asvr9800Group.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "cpf", scope = BeneficiariosGroup.class)
    public JAXBElement<String> createBeneficiariosGroupCpf(String value) {
        return new JAXBElement<String>(_BeneficiariosGroupCpf_QNAME, String.class, BeneficiariosGroup.class, value);
    }

    @XmlElementDecl(namespace = "", name = "cnpj", scope = BeneficiariosGroup.class)
    public JAXBElement<String> createBeneficiariosGroupCnpj(String value) {
        return new JAXBElement<String>(_BeneficiariosGroupCnpj_QNAME, String.class, BeneficiariosGroup.class, value);
    }

}
