package br.com.pedrodavi.batch.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@XmlRootElement(name = "report")
@XmlType(propOrder = { "clientes" })
public class File {

    private List<Cliente> clientes;

}
