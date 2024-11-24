package com.primestore.bl_customer_service.repository;

import com.primestore.bl_customer_service.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByLogin(String customerName);
}
