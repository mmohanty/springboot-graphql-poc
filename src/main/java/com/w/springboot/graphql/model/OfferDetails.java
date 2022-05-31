package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfferDetails {

    private Long id;
    private String createdOn;
    private String validTill;
}
