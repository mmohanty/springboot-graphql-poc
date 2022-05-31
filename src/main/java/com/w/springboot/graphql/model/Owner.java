package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Owner {

    private String userId;
    private List<Address> addresses;
    private List<Email> emails;
    public List<String> names;
    private List<Phone> phoneNumbers;

}
