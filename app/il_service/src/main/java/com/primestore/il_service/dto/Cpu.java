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
public class Cpu {
    private Integer id;
    private String model;
    private Integer cores;
}