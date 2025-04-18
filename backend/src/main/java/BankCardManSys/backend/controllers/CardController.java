package BankCardManSys.backend.controllers;

import BankCardManSys.backend.models.Card;
import BankCardManSys.backend.services.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/cards")
public class CardController {

    private final CardsService cardsService;

    @Autowired
    public CardController(CardsService cardsService) {
        this.cardsService = cardsService;
    }

    @GetMapping("/all")
    public List<Card> loadCards() {
        return cardsService.loadCards();
    }

    @PostMapping("/new")
    public void createCard(@RequestBody Card card) {
        cardsService.createCard(card);
    }

    @PutMapping("/block/{id}")
    public void blockCard(@RequestBody Card card, @PathVariable int id) {
        cardsService.blockCard(card, id);
    }

    @PutMapping("/activate/{id}")
    public void activateCard(@RequestBody Card card, @PathVariable int id) {
        cardsService.activateCard(card, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCard(@PathVariable int id) {
        cardsService.deleteCard(id);
    }

/*
    @PostMapping("/transfer")
    public void transferCard(PostMapping)
*/

}
