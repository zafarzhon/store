package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Entity
@Table(name = "cpus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cpu {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 30)
    private String model;
    private Integer cores;
}