package com.primestore.bl_product_service.controller;


import com.primestore.bl_product_service.domain.Laptop;
import com.primestore.bl_product_service.domain.Phone;
import com.primestore.bl_product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SampleController {
    private final ProductService productService;

    @GetMapping("/phone/list")
    public List<Phone> getPhoneList() {
        return productService.getAllPhones();
    }

    @GetMapping("/laptop/list")
    public List<Laptop> getLaptopList() {
        return productService.getAllLaptops();
    }

}
