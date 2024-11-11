package com.primestore.bl_product_service.repository;

import com.primestore.bl_product_service.domain.Laptop;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public interface LaptopRepo extends JpaRepository<Laptop, Integer> {
    @EntityGraph(attributePaths = {"battery", "cpu", "display", "memory"})
    List<Laptop> findAll();
}
