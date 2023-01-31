package com.mindhub.homebanking.services.Implements;

import com.mindhub.homebanking.DTO.ClientDTO;
import com.mindhub.homebanking.DTO.LoanDTO;
import com.mindhub.homebanking.services.LoanServices;
import com.mindhub.homebanking.models.Loan;
import com.mindhub.homebanking.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanServicesImplement implements LoanServices {

    @Autowired
    LoanRepository loanRepository;

    public List<LoanDTO> getLoanDTO() {

        return loanRepository.findAll().stream().map(loan -> new LoanDTO(loan)).collect(Collectors.toList());
    }

    @Override
    public Loan getLoanById(long id) {
        return loanRepository.findById(id).orElse(null);
    }



    @Override
    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }

    @Override
    public void saveLoan(Loan loan) {
        loanRepository.save(loan);
    }


}