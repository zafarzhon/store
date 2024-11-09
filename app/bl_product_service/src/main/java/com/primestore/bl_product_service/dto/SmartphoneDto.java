package com.primestore.bl_product_service.dto;

import com.primestore.bl_product_service.domain.Battery;
import com.primestore.bl_product_service.domain.Cpu;
import com.primestore.bl_product_service.domain.Display;
import com.primestore.bl_product_service.domain.Memory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SmartphoneDto extends ProductDto {
    private Cpu cpu;
    private Memory memory;
    private Display display;
    private Battery battery;
    private String operationSystem;
    private Boolean hasExMemoryCardSlot;
    private Integer countSimCards;
    private Boolean esimSupport;
    private String communicationStandard;
    private Integer countMainCamera;
    private String mainCameraResolution;
    private Boolean hasNFC;
    private String bluetooth;
    private String wifi;
}
