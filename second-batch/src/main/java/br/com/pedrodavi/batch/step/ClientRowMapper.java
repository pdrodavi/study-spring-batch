package br.com.pedrodavi.batch.step;

import br.com.pedrodavi.batch.entity.Client;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ClientRowMapper implements RowMapper<Client> {

    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client();
        client.setDETAL_OCORR(rs.getString("DETAL_OCORR"));
        client.setID_VALOR_DEVOL(rs.getString("ID_VALOR_DEVOL"));
        return client;
    }

}
