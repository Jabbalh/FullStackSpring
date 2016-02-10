package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nico on 09/02/2016.
 */
@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientDao;


    @Override
    public Client getClient(String login){

        return clientDao.findOne(1);
    }

}
