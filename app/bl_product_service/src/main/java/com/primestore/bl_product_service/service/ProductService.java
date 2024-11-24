package com.primestore.bl_product_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class ProductService {
    private final LaptopService laptopService;
    private final SmartphoneService smartphoneService;
}
