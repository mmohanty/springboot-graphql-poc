package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Balance {

    private String number;
    private Double available;
    private Double current;
    private String isoCurrencyCode;
    private String limit;
    private String dateTime;
}
