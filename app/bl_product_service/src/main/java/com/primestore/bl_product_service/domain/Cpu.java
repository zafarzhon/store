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
@Table(name = "cpus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cpu {
    @Id
    @GeneratedValue
    private UUID id;
    private String model;
    private Integer cores;
}