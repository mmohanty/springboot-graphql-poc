package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String city;
    private String country;
    private String postalCode;
    private String region;
    private String street;
    private Boolean primary;
}
