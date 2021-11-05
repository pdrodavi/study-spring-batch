package br.com.pedrodavi.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class BuildClientJob {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job clientJob(final Step clientStep) {
        return jobBuilderFactory.get("loadingBuildClientJob")
                .incrementer(new RunIdIncrementer())
                .flow(clientStep)
                .end()
                .build();
    }

}
