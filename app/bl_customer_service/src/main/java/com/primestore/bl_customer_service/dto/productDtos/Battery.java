package com.primestore.bl_customer_service.dto.productDtos;

import lombok.*;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Battery {
    private Integer id;
    private Integer capacity;
    private Double maxChargePower;
    private Boolean hasWirelessCharge;
    private Boolean hasReverseCharge;
    private Boolean hasFastCharge;
}
