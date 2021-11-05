package br.com.pedrodavi.batch.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@ToString
@NoArgsConstructor
@XmlRootElement(name = "cliente")
@XmlType(propOrder = { "nome", "sobrenome", "idade", "email" })
public class Cliente {

    private String nome;
    private String sobrenome;
    private String idade;
    private String email;

}
