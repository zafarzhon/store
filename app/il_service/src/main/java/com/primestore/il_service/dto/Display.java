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
public class Display {
    private Integer id;
    private Double diagonal;
    private Integer refreshRate;
    private String type;
    private String resolution;

}