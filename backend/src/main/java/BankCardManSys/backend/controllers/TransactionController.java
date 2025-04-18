package BankCardManSys.backend.controllers;


import BankCardManSys.backend.models.Transaction;
import BankCardManSys.backend.services.TransactionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionalService transactionalService;

    @Autowired
    public TransactionController(TransactionalService transactionalService) {
        this.transactionalService = transactionalService;
    }

    @GetMapping("/card/{id}/transactions")
    public List<Transaction> loadTransactions(@PathVariable int id) {
        return transactionalService.loadAllTransactions(id);
    }

}
