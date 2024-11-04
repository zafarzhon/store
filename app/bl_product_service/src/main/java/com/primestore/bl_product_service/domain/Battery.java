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
@Table(name = "batteries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Battery {
    @Id
    @GeneratedValue
    private UUID id;
    private Integer capacity;
    private Double maxChargePower;
    private String type;
    private Boolean hasWirelessCharge;
    private Boolean hasReverseCharge;
    private Boolean hasFastCharge;

}
