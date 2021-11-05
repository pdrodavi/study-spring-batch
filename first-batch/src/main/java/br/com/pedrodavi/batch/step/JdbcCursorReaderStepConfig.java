package br.com.pedrodavi.batch.step;

import br.com.pedrodavi.batch.model.Cliente;
import br.com.pedrodavi.batch.model.Value;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcCursorReaderStepConfig {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step jdbcCursorReaderStep(ItemReader<Value> jdbcCursorReader, ItemWriter<Value> jdbcCursorWriter) {
        return stepBuilderFactory
                .get("jdbcCursorReaderStep")
                .<Value, Value>chunk(1)
                .reader(jdbcCursorReader)
                .writer(jdbcCursorWriter)
                .build();
    }

}
