package com.mindhub.homebanking.services.Implements;

import com.mindhub.homebanking.DTO.ClientDTO;
import com.mindhub.homebanking.services.ClientServices;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServicesImplement implements ClientServices {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<ClientDTO> getClientDTO() {
        return clientRepository.findAll().stream().map(client -> new ClientDTO(client)).collect(Collectors.toList());

    }

    @Override
    public ClientDTO getClientById(long id) {
        return clientRepository.findById(id).map(client -> new ClientDTO(client)).orElse(null);
    }

    @Override
    public Client findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }
}
