package com.primestore.il_service.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@SuperBuilder
public abstract class Product {

    private UUID id;
    private String name;
    private String model;

    private int productCode;
    private int count;

    private double outerPrice;

    private double innerPrice;
    private String description;
    private String color;
    private Integer releaseYear;

    private Weight weight;

    private Dimension dimension;
    private String country;
    private Integer warranty; // months
}
