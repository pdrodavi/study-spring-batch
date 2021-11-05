//package br.com.pedrodavi.batch.step;
//
//import br.com.pedrodavi.batch.model.Cliente;
//import br.com.pedrodavi.batch.model.Value;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.item.ItemReader;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JdbcPagingReaderStepConfig {
//
//    @Autowired
//    private StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public Step jdbcPagingReaderStep(ItemReader<Value> jdbcPagingReader, ItemWriter<Value> jdbcPagingWriter) {
//        return stepBuilderFactory
//                .get("jdbcPagingReaderStep")
//                .<Value, Value>chunk(1)
//                .reader(jdbcPagingReader)
//                .writer(jdbcPagingWriter)
//                .build();
//    }
//}