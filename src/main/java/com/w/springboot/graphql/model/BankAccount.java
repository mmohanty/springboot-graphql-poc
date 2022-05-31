package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BankAccount {

    private Long id;
    private String number;
    private String currency;
    private AccountType accountType;
    private String name;
    private String officialName;
    private List<Owner> owners;
    private Balance balance;
    private List<Transaction> transactions;
    private User profile;
    private List<Offer> offers;
}
