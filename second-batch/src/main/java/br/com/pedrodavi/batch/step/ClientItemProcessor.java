package br.com.pedrodavi.batch.step;

import br.com.pedrodavi.batch.entity.Client;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientItemProcessor implements ItemProcessor<Client, Client> {
    @Override
    public Client process(final Client client) throws Exception {
        client.setDETAL_OCORR(Optional.ofNullable(client.getDETAL_OCORR()).map(String::toUpperCase).orElse(null));
        client.setID_VALOR_DEVOL(Optional.ofNullable(client.getID_VALOR_DEVOL()).map(String::toUpperCase).orElse(null));
        return client;
    }
}
