package com.projectcard.card.service;

import com.projectcard.card.entity.CardsDTO;
import com.projectcard.card.repository.RepositoryCardsUsage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class CardService {


    @Autowired
    private RepositoryCardsUsage repository;

    public CardsDTO saveCard(CardsDTO cards){
        return repository.save(cards);
    }

    public List<CardsDTO> saveCards(List<CardsDTO> cards){
        return (List<CardsDTO>) repository.saveAll(cards);
    }

    public CardsDTO getCardsById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public CardsDTO getCardsByName(String nameOfCard){
        return repository.findByNameOfCard(nameOfCard);
    }

    public String deleteCard(Integer id){
        repository.deleteById(id);
        return "A carta de id " + id +" foi removida com sucesso!";
    }

    public CardsDTO updateCards(CardsDTO cards){
        CardsDTO existingCards = repository.findById(cards.getId()).orElse(null);
        existingCards.setTheAmount(cards.getTheAmount());
        existingCards.setPrice(cards.getPrice());
        return repository.save(existingCards);
    }
}
