package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Entity
@Table(name = "dimensions")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Dimension {
    @Id
    @GeneratedValue
    private UUID id;
    private Double width;
    private Double height;
    private Double length;
    private Double depth;
    @Enumerated(EnumType.STRING)
    private DimensionUnit unit;

    @Getter
    @AllArgsConstructor
    public enum DimensionUnit {
        MM("millimeter"), CM("centimeter"), M("meter");

        private final String name;

    }
}
