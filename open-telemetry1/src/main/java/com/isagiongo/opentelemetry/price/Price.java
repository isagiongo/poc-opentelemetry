package com.isagiongo.opentelemetry.price;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {

    private long productId;
    private double priceAmount;
    private double discount;

}
