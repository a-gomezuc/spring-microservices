package github.agomezuc.accountservice.controller;

import github.agomezuc.accountservice.domain.Account;
import github.agomezuc.accountservice.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @PostMapping
    public Account addAccount(@RequestBody @Valid Account account) {
        return accountService.saveAccount(account);
    }
}
