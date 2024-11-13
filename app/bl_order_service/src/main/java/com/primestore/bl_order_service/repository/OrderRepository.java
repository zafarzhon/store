package com.primestore.bl_order_service.repository;

import com.primestore.bl_order_service.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
