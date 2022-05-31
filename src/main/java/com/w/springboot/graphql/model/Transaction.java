package com.w.springboot.graphql.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {
    private Long id;
    private String number;
    private String dateTime;
    private TransactionType typeCode;
    private Double amount;
    private String description;
    private String currency;
}
