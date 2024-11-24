package com.primestore.bl_customer_service.dto.productDtos;

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
public class LaptopDto extends ProductDto {
    private String fullName;
    private Cpu cpu;
    private String gpu;
    private Memory memory;
    private Display display;
    private Battery battery;
    private String operationSystem;
    private Integer cameraResolution;
    private String bluetooth;
    private String wifi;
    private Boolean forPlaying;
}
