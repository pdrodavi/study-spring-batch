package br.com.pedrodavi.batch.reader;

import br.com.pedrodavi.batch.model.Cliente;
import br.com.pedrodavi.batch.model.Value;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class JdbcCursorReaderConfig {

//    public class CustomerCreditRowMapper implements RowMapper<CustomerCredit> {
//
//        public static final String ID_COLUMN = "id";
//        public static final String NAME_COLUMN = "name";
//        public static final String CREDIT_COLUMN = "credit";
//
//        public CustomerCredit mapRow(ResultSet rs, int rowNum) throws SQLException {
//            CustomerCredit customerCredit = new CustomerCredit();
//
//            customerCredit.setId(rs.getInt(ID_COLUMN));
//            customerCredit.setName(rs.getString(NAME_COLUMN));
//            customerCredit.setCredit(rs.getBigDecimal(CREDIT_COLUMN));
//
//            return customerCredit;
//        }
//    }

    @Bean
    public JdbcCursorItemReader<Value> jdbcCursorReader(@Qualifier("appDataSource") DataSource dataSource) {
        return new JdbcCursorItemReaderBuilder<Value>()
                .name("jdbcCursorReader")
                .dataSource(dataSource)
                .sql("SELECT * FROM \"TAO\".\"TB_VALOR_DEVOL\"")
                .rowMapper(new BeanPropertyRowMapper<Value>(Value.class))
                .build();
    }

//    //For simplicity sake, assume a dataSource has already been obtained
//    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//    List customerCredits = jdbcTemplate.query("SELECT ID, NAME, CREDIT from CUSTOMER",
//            new CustomerCreditRowMapper());

//    @Bean
//    public JdbcCursorItemReader<CustomerCredit> itemReader() {
//        return new JdbcCursorItemReaderBuilder<CustomerCredit>()
//                .dataSource(this.dataSource)
//                .name("creditReader")
//                .sql("select ID, NAME, CREDIT from CUSTOMER")
//                .rowMapper(new CustomerCreditRowMapper())
//                .build();
//
//    }

}
