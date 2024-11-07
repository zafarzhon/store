package com.primestore.bl_product_service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Entity
@Table(name = "displays")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Display {
    @Id
    @GeneratedValue
    private UUID id;
    private Double diagonal;
    private Integer refreshRate;
    private String type;
    private String resolution;
    private String resolutionFormat;

}