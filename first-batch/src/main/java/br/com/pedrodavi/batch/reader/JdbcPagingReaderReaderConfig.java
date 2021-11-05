//package br.com.pedrodavi.batch.reader;
//
//import br.com.pedrodavi.batch.model.Cliente;
//import br.com.pedrodavi.batch.model.Value;
//import org.springframework.batch.item.database.JdbcPagingItemReader;
//import org.springframework.batch.item.database.PagingQueryProvider;
//import org.springframework.batch.item.database.builder.JdbcPagingItemReaderBuilder;
//import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class JdbcPagingReaderReaderConfig {
//
//	@Bean
//	public JdbcPagingItemReader<Value> jdbcPagingReader(@Qualifier("appDataSource") DataSource dataSource,
//														PagingQueryProvider queryProvider) {
//		return new JdbcPagingItemReaderBuilder<Value>()
//				.name("jdbcPagingReader")
//				.dataSource(dataSource)
//				.queryProvider(queryProvider)
//				.pageSize(1)
//				.rowMapper(new BeanPropertyRowMapper<>(Value.class))
//				.build();
//	}
//
//	@Bean
//	public SqlPagingQueryProviderFactoryBean queryProvider(@Qualifier("appDataSource") DataSource dataSource) {
//		SqlPagingQueryProviderFactoryBean queryProvider = new SqlPagingQueryProviderFactoryBean();
//		queryProvider.setDataSource(dataSource);
//		queryProvider.setSelectClause("SELECT *");
//		queryProvider.setFromClause("FROM TAO.TB_VALOR_DEVOL");
//		queryProvider.setSortKey("NR_SEQ_DEVOL");
//		return queryProvider;
//	}
//
//}
