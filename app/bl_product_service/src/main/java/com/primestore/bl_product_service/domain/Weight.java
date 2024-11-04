package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Entity
@Table(name = "weights")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Weight {
    @Id
    @UuidGenerator
    private UUID id;
    private Double weight;
    @Enumerated(EnumType.STRING)
    private WeightUnit unit;

    @Getter
    @AllArgsConstructor
    public enum WeightUnit {
        KG("kilogram"), G("gram"), MG("milligram"),
        ;
        private final String name;
    }
}
