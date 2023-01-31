package com.mindhub.homebanking.services;

import com.mindhub.homebanking.DTO.AccountDTO;
import com.mindhub.homebanking.DTO.ClientDTO;
import com.mindhub.homebanking.DTO.LoanDTO;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.models.Loan;
import com.mindhub.homebanking.repositories.LoanRepository;

import java.util.List;

public interface LoanServices {

    public List<LoanDTO> getLoanDTO();

    public Loan getLoanById(long id);

    public List<Loan> getLoans();

    public void saveLoan(Loan loan);




}
