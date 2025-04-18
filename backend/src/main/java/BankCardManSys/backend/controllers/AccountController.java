package BankCardManSys.backend.controllers;

import BankCardManSys.backend.models.Account;
import BankCardManSys.backend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.loadAccounts();
    }

    @PostMapping("/create")
    public void createAccount(Account account) {
        accountService.CreateAccount(account);
    }



}
