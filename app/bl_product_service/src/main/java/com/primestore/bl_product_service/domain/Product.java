package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
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
@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@SuperBuilder
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String model;
    @Column(name = "product_code")
    private int productCode;
    private int count;
    @Column(name = "outer_price")
    private double outerPrice;
    @Column(name = "inner_price")
    private double innerPrice;
    private String description;
    private String color;
    private Integer releaseYear;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weight_id")
    private Weight weight;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dimension_id")
    private Dimension dimension;
    private String country;
    private Integer warranty; // months
}
