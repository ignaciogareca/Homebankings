package com.mindhub.homebanking.services;

import com.mindhub.homebanking.DTO.ClientDTO;
import com.mindhub.homebanking.models.Client;

import java.util.List;

public interface ClientServices {

    public List<ClientDTO> getClientDTO();

    public ClientDTO getClientById(long id);

    public Client findByEmail(String email);

    public void saveClient(Client client);



}