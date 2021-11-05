//package br.com.pedrodavi.batch.writer;
//
//import br.com.pedrodavi.batch.model.Cliente;
//import br.com.pedrodavi.batch.model.File;
//import br.com.pedrodavi.batch.model.Value;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JdbcPagingReaderWriterConfig {
//
//	@Bean
//	public ItemWriter<Value> jdbcPagingWriter() {
//		return clientes -> clientes.forEach(System.out::println);
//	}
//
////	@Bean
////	public ItemWriter<Cliente> jdbcPagingWriter() {
////		File output = new File();
////		return clientes -> clientes.forEach(
////				cliente -> output.getClientes().add(cliente)
////		);
////	}
//
//}
