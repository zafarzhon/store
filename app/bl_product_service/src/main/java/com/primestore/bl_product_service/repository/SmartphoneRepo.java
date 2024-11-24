package com.primestore.bl_product_service.repository;

import com.primestore.bl_product_service.domain.Smartphone;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public interface SmartphoneRepo extends JpaRepository<Smartphone, Integer> {
    @EntityGraph(attributePaths = {"battery", "cpu", "display", "memory"})
    List<Smartphone> findAll();

}