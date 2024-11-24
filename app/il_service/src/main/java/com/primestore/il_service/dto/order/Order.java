package com.primestore.il_service.dto.order;

import com.primestore.il_service.dto.Customer;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    private Integer id;
    private List<Product> products = new ArrayList<>();
    private Customer customer;
    private LocalDateTime createdAt;
    private Status status;
    private Integer totalPrice;
}
