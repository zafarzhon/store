package com.primestore.bl_product_service.service;


import com.primestore.bl_product_service.domain.Laptop;
import com.primestore.bl_product_service.domain.Phone;
import com.primestore.bl_product_service.domain.Product;
import com.primestore.bl_product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repo;

    public void addProduct(Product product) {
        repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public List<Phone> getAllPhones() {
        return repo.findAll().stream().filter(product -> product instanceof Phone).map(Phone.class::cast).toList();
    }

    public List<Laptop> getAllLaptops() {
        return repo.findAll().stream().filter(product -> product instanceof Laptop).map(Laptop.class::cast).toList();
    }
}
