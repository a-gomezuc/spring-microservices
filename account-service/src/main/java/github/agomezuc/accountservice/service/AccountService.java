package github.agomezuc.accountservice.service;

import github.agomezuc.accountservice.domain.Account;
import github.agomezuc.accountservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
