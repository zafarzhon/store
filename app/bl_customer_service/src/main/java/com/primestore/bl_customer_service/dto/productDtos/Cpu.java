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
public class Cpu {
    private Integer id;
    private String model;
    private Integer cores;
}