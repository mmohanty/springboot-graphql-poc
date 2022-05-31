package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Phone {

    private String number;
    private Boolean primary;
    private String type;
}
