package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.*;

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
    private Integer id;
    @Column(columnDefinition = "Numeric(2,2)")
    private Double diagonal;
    private Integer refreshRate;
    @Column(length = 10)
    private String type;
    @Column(length = 30)
    private String resolution;

}