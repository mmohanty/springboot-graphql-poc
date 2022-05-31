package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountFilter {

    private String number;
    private String currency;
    private AccountType accountType;
}
