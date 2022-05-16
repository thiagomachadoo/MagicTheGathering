package com.projectcard.card.controller;


import com.projectcard.card.entity.CardsDTO;
import com.projectcard.card.repository.RepositoryCardsUsage;
import com.projectcard.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService service;


    @Autowired
    private RepositoryCardsUsage repository;

    @PostMapping("/addCard")
    public CardsDTO addCard(@RequestBody CardsDTO cards){
        return service.saveCard(cards);
    }

    @PostMapping("/addCards")
    public List<CardsDTO> addCards(@RequestBody  List<CardsDTO> cards){
        return service.saveCards(cards);
    }

    @GetMapping(value = "/pageable")
    Page itsPageble(@RequestParam(required = false) String nameOfCard, @PageableDefault(sort = "price", direction = Sort.Direction.ASC) Pageable pageable){
        return repository.findAll(pageable);
    }

    @GetMapping("/cardsById/{id}")
    public CardsDTO findCardsById(@PathVariable Integer id){
        return  service.getCardsById(id);
    }

    @GetMapping("/cardByName/{name}")
    public CardsDTO findCardByName(@PathVariable String nameOfCard){
        return  service.getCardsByName(nameOfCard);
    }

    @PutMapping("/update")
    public CardsDTO updateCard( @RequestBody CardsDTO cards){
       return service.updateCards(cards);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCards(@PathVariable Integer id){
        return service.deleteCard(id);
    }
}
