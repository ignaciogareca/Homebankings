package com.mindhub.homebanking.services;


import com.mindhub.homebanking.DTO.AccountDTO;
import com.mindhub.homebanking.DTO.ClientDTO;
import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;

import java.util.List;

public interface AccountServices {

    public List<AccountDTO> getAccountDTO();

    public AccountDTO getAccountById(long id);

    public Account findByNumber(String number);

    public void saveAccount(Account account);

}