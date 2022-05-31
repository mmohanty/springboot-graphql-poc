package com.w.springboot.graphql.controller;


import com.w.springboot.graphql.model.AccountFilter;
import com.w.springboot.graphql.model.BankAccount;
import com.w.springboot.graphql.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.ContextValue;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AccountController {

    private final AccountRepository  accountRepository;

    @QueryMapping
    List<BankAccount> accounts(@Argument AccountFilter filter) {
        return accountRepository.getBankAccounts(filter);
    }
}
