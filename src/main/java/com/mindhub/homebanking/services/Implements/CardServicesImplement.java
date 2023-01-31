package com.mindhub.homebanking.services.Implements;

import com.mindhub.homebanking.models.Card;
import com.mindhub.homebanking.repositories.CardRepository;
import com.mindhub.homebanking.services.CardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServicesImplement implements CardServices {
    @Autowired
    CardRepository cardRepository;


    @Override
    public void saveCard(Card card) {
        cardRepository.save(card);
    }



}
