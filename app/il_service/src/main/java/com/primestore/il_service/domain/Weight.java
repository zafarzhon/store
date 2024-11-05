package com.primestore.il_service.domain;

import lombok.*;

import java.util.UUID;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Weight {
    private UUID id;
    private Double weight;
    private WeightUnit unit;

    @Getter
    @AllArgsConstructor
    public enum WeightUnit {
        KG("kilogram"), G("gram"), MG("milligram"),
        ;
        private final String name;
    }
}
