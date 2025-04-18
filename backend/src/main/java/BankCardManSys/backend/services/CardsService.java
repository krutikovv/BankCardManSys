package BankCardManSys.backend.services;

import BankCardManSys.backend.models.Card;
import BankCardManSys.backend.models.CardStatus;
import BankCardManSys.backend.repositories.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardsService {

    private final CardsRepository cardsRepository;

    @Autowired
    public CardsService(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @Transactional(readOnly = true)
    public List<Card> loadCards() {
        return cardsRepository.findAll();
    }

    @Transactional
    public void createCard(Card card) {
        cardsRepository.save(card);
    }

    @Transactional
    public void blockCard(Card card, Integer id) {
//        card.setStatus(CardStatus.BLOCKED);
        Optional<Card> checkCard = cardsRepository.findById(id);
        checkCard.ifPresent(cardsRepository::save);
    }

    @Transactional
    public void activateCard(Card card, Integer id) {
//        card.setStatus(CardStatus.ACTIVE);
        Optional<Card> checkCard = cardsRepository.findById(id);
        checkCard.ifPresent(cardsRepository::save);
    }

    @Transactional
    public void deleteCard(Integer id) {
        cardsRepository.deleteById(id);
    }

}
