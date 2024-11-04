package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Entity
@Table(name = "phones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Phone extends Product {
    private String cpuModel;
    private Integer ramSize;
    private String ramType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "battery_id")
    private Battery battery;


}
