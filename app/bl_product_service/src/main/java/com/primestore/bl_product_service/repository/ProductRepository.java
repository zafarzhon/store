package com.primestore.bl_product_service.repository;

import com.primestore.bl_product_service.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
