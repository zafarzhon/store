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
public class Memory {
    private Integer id;
    private Integer ram;
    private String ramType;
    private Integer rom;
    private String romType;
}