package BankCardManSys.backend.services;

import BankCardManSys.backend.models.Card;
import BankCardManSys.backend.models.Transaction;
import BankCardManSys.backend.repositories.CardsRepository;
import BankCardManSys.backend.repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionalService {

    private final TransactionsRepository transactionsRepository;

    private final CardsRepository cardsRepository;

    @Autowired
    public TransactionalService(TransactionsRepository transactionsRepository,
                                CardsRepository cardsRepository) {
        this.transactionsRepository = transactionsRepository;
        this.cardsRepository = cardsRepository;
    }


    public List<Transaction> loadAllTransactions(int userId) {
        Card card = cardsRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Card not found"));
        return card.getTransactions();
    }
}
