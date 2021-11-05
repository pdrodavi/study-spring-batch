package br.com.pedrodavi.batch.writer;

import br.com.pedrodavi.batch.model.Asvr9800Group;
import br.com.pedrodavi.batch.model.Cliente;
import br.com.pedrodavi.batch.model.Value;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class JdbcCursorWriterConfig {

//    @Bean
//    public ItemWriter<Value> jdbcCursorWriter() {
//        return clientes -> clientes.forEach(System.out::println);
//    }

//    @Bean
//    public ItemWriter<Value> jdbcCursorWriter() {
//        return clientes -> clientes.forEach(clientes);
//    }

    @Bean
    ItemWriter<Value> databaseXmlItemWriter() {
        StaxEventItemWriter<Value> xmlFileWriter = new StaxEventItemWriter<>();

        String exportFilePath = "values.xml";
        xmlFileWriter.setResource(new FileSystemResource(exportFilePath));

        xmlFileWriter.setRootTagName("value");

        Jaxb2Marshaller studentMarshaller = new Jaxb2Marshaller();
        studentMarshaller.setClassesToBeBound(Value.class);
        xmlFileWriter.setMarshaller(studentMarshaller);

        return xmlFileWriter;
    }

}
