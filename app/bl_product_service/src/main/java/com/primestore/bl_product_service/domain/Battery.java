package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.*;

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
public class Battery {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer capacity;
    @Column(name = "max_charge_power", columnDefinition = "Numeric(3,1)")
    private Double maxChargePower;
    @Column(name = "has_wireless_charge", nullable = false, columnDefinition = "bool default 'false'")
    private Boolean hasWirelessCharge;
    @Column(name = "has_reverse_charge", nullable = false, columnDefinition = "bool default 'false'")
    private Boolean hasReverseCharge;
    @Column(name = "has_fast_charge", nullable = false, columnDefinition = "bool default 'false'")
    private Boolean hasFastCharge;

}
