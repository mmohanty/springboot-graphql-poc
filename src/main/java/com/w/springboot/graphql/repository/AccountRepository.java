package com.w.springboot.graphql.repository;


import com.w.springboot.graphql.model.AccountFilter;
import com.w.springboot.graphql.model.AccountType;
import com.w.springboot.graphql.model.Balance;
import com.w.springboot.graphql.model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public AccountRepository(){
        BankAccount account = BankAccount.builder().accountType(AccountType.credit)
                .balance(Balance.builder().dateTime("20/10/2022").build()).build();
        bankAccounts.add(account);
    }

    public List<BankAccount> getBankAccounts(AccountFilter filter){
        return bankAccounts;
    }
}
