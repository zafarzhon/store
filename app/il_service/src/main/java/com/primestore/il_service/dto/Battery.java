package com.primestore.il_service.dto;

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
