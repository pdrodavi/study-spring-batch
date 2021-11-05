package br.com.pedrodavi.batch.step;

import br.com.pedrodavi.batch.entity.Client;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Component
public class ClientItemWriter extends FlatFileItemWriter<Client> {

    public ClientItemWriter() {
        this.setResource(new FileSystemResource("aircraft.csv"));
        this.setHeaderCallback(writer -> writer.write("Name, IATA code, ICAO code"));
        BeanWrapperFieldExtractor<Client> beanWrapperFieldExtractor = new BeanWrapperFieldExtractor<>();
        beanWrapperFieldExtractor.setNames(new String[]{"ID_VALOR_DEVOL", "ID_VALOR_DEVOL"});
        DelimitedLineAggregator<Client> lineAggregator = new DelimitedLineAggregator<>();
        lineAggregator.setFieldExtractor(beanWrapperFieldExtractor);
        this.setLineAggregator(lineAggregator);
    }
}
