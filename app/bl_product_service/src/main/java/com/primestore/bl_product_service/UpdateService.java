package com.primestore.bl_product_service;

import com.primestore.bl_product_service.domain.Laptop;
import com.primestore.bl_product_service.domain.Smartphone;
import com.primestore.bl_product_service.repository.LaptopRepo;
import com.primestore.bl_product_service.repository.SmartphoneRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor

public class UpdateService {
    private final SmartphoneRepo sRepo;
    private final LaptopRepo lRepo;

    public void getAndSave() {
        List<Smartphone> smartphones = sRepo.findAll();
        for (Smartphone smartphone : smartphones) {
            smartphone.setCost(smartphone.getCost() - 1000);
        }
        System.out.println();
        sRepo.saveAll(smartphones);
        List<Laptop> laptops = lRepo.findAll();
        for (Laptop laptop : laptops) {
            laptop.setCost(laptop.getCost() - 1000);
        }
        System.out.println();
        lRepo.saveAll(laptops);
    }


}
