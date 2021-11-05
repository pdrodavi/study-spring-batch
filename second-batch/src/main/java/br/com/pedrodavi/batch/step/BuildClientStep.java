package br.com.pedrodavi.batch.step;

import br.com.pedrodavi.batch.entity.Client;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuildClientStep {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step clientStep(ClientCursorItemReader clientCursorItemReader, ClientItemProcessor clientItemProcessor,
                                ClientItemWriter clientItemWriter) {
        return stepBuilderFactory.get("buildClientStep")
                .<Client, Client>chunk(10)
                .reader(clientCursorItemReader)
                .processor(clientItemProcessor)
                .writer(clientItemWriter)
                .build();
    }

}
