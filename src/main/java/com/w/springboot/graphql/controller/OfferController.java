package com.w.springboot.graphql.controller;

import com.w.springboot.graphql.model.AccountFilter;
import com.w.springboot.graphql.model.BankAccount;
import com.w.springboot.graphql.model.Offer;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OfferController {

    @SchemaMapping
    List<Offer> offers(BankAccount bankAccount) {
        Offer offer = Offer.builder().offerKey("12").offerName("Cashback").promoCode("123").build();
        List<Offer> list = new ArrayList<>();
        list.add(offer);
        return list;
    }
}
