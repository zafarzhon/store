package com.primestore.il_service.domain;


import lombok.*;

import java.util.UUID;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Battery {
    private UUID id;
    private Integer capacity;
    private Double maxChargePower;
    private String type;
    private Boolean hasWirelessCharge;
    private Boolean hasReverseCharge;
    private Boolean hasFastCharge;

}
