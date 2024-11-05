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
public class Dimension {

    private UUID id;
    private Double width;
    private Double height;
    private Double length;
    private Double depth;

    private DimensionUnit unit;

    @Getter
    @AllArgsConstructor
    public enum DimensionUnit {
        MM("millimeter"), CM("centimeter"), M("meter");

        private final String name;

    }
}
