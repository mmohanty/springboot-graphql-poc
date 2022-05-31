package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Email {

    private String address;
    private Boolean primary;
    private String type;
}
