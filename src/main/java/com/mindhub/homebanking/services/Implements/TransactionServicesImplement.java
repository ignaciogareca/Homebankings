package com.mindhub.homebanking.services.Implements;

import com.mindhub.homebanking.DTO.ClientDTO;
import com.mindhub.homebanking.DTO.TransactionDTO;
import com.mindhub.homebanking.services.TransactionServices;
import com.mindhub.homebanking.models.Card;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TransactionServicesImplement implements TransactionServices {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<TransactionDTO> getTransactionDTO() {
        return transactionRepository.findAll().stream().map(transaction -> new TransactionDTO(transaction)).collect(Collectors.toList());

    }

    @Override
    public TransactionDTO getTransactionById(long id) {
        return transactionRepository.findById(id).map(transaction -> new TransactionDTO(transaction)).orElse(null);
    }


    @Override
    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public Set<Transaction> getTransactionByDate (LocalDateTime dateFrom, LocalDateTime dateTo) {
        return transactionRepository.findByDateBetween(dateFrom, dateTo);
    }

}