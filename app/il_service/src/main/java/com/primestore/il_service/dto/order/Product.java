package com.primestore.il_service.dto.order;

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
public class Product {
    private Integer id;
    private Integer productId;
    private Integer quantity;
    private Integer price;
}
