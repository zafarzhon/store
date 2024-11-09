package com.primestore.bl_product_service.repository;

import com.primestore.bl_product_service.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
