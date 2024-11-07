package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Random;
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
    @Column(name = "product_code")
    private Integer productCode;
    private String type;
    private String brand;
    private String model;
    private String description;
    private Integer discount;
    private Double priceExDiscount; // price without discount
    private Double priceWithDiscount; // price with discount
    private Double cost; // real cost
    private String color;
    private Integer count;
    private Integer warranty; // months
    private Integer releaseYear;
    private Double height; // mm
    private Double width; // mm
    private Double thickness; // mm
    private Double weight; // gram
    private String country;

    /*
        productCode
        b=brend.hashcode%10
        t=type.hashcode%10
        m=model.hashcode%10
        (b+t*10+m*100)*10000+((RANDOM*10000)+1000)%1000 ->1234567
     */
    @PrePersist
    private void postLoad() {
        generateProductCode();
    }

    private void generateProductCode() {
        if (this.productCode == null) {
            var b = Math.abs(this.brand.hashCode()) % 9 + 1;
            var t = Math.abs(this.type.hashCode()) % 9 + 1;
            var m = Math.abs(this.model.hashCode()) % 9 + 1;
            var left = (b * 100 + t * 10 + m) * 10000;
            var right = new Random().nextInt(9000) + 1000;
            this.productCode = left + right;
        }
    }

    @PreUpdate
    private void preUpdate() {
        setPriceWithDiscount(calcPriceWithDiscount());
    }

    private Double calcPriceWithDiscount() {
        Double newPrice = this.priceExDiscount * (1 - this.discount / 100);
        return this.priceExDiscount - newPrice < 1.0 ? 1.0 : newPrice;
    }
}
