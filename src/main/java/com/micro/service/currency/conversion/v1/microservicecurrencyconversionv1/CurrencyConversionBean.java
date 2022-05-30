package com.micro.service.currency.conversion.v1.microservicecurrencyconversionv1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CurrencyConversionBean {
    long id;
    String from;
    String to;
    double conversionMultiple;
    double quantity;
    double totalCalculatedAmount;
    int port;

    public CurrencyConversionBean(long id, String from, String to, double conversionMultiple, double quantity, double totalCalculatedAmount, int port) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }
}
