package br.com.pedrodavi.batch.step;

import br.com.pedrodavi.batch.entity.Client;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ClientCursorItemReader extends JdbcCursorItemReader<Client> {

    private static final String SQL_COMMAND = "SELECT * FROM \"TAO\".\"TB_VALOR_DEVOL\";";

    public ClientCursorItemReader(final DataSource dataSource, final ClientRowMapper clientRowMapper) {
        this.setDataSource(dataSource);
        this.setRowMapper(clientRowMapper);
        this.setSql(SQL_COMMAND);
    }
}
