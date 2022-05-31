package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Offer {

    private Long id;
    private String offerName;
    private String offerType;
    private Boolean status;
    private String promoCode;
    private String offerKey;
    private OfferDetails offerDetails;
}
