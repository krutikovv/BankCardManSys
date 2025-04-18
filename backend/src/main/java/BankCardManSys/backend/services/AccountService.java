package BankCardManSys.backend.services;

import BankCardManSys.backend.models.Account;
import BankCardManSys.backend.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional(readOnly = true)
    public List<Account> loadAccounts() {
        return accountRepository.findAll();
    }

    @Transactional
    public void CreateAccount(Account account) {
        accountRepository.save(account);
    }

}
