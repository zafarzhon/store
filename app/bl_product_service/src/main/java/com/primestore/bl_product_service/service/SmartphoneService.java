package com.primestore.bl_product_service.service;

import com.primestore.bl_product_service.domain.Smartphone;
import com.primestore.bl_product_service.dto.SmartphoneDto;
import com.primestore.bl_product_service.mapper.SmartphoneMapper;
import com.primestore.bl_product_service.repository.SmartphoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class SmartphoneService {
    private final SmartphoneRepository smartphoneRepo;
    private final SmartphoneMapper mapper;

    public List<SmartphoneDto> getAll() {
        return mapper.toDto(smartphoneRepo.findAll());
    }

    public void decrement(int id, int count) {
        Smartphone smartphone = smartphoneRepo.findById(id).orElseThrow(() -> new RuntimeException("Smartphone not found"));
        if (smartphone.getCount() - count < 0) {
            throw new RuntimeException("Smartphone count exceeds limit");
        }
        smartphone.setCount(smartphone.getCount() - count);
        smartphoneRepo.save(smartphone);
    }

    public void increment(int id, int count) {
        Smartphone smartphone = smartphoneRepo.findById(id).orElseThrow(() -> new RuntimeException("Smartphone not found"));
        if (count < 0) {
            throw new RuntimeException("increment count less than zero");
        }
        smartphone.setCount(smartphone.getCount() + count);
        smartphoneRepo.save(smartphone);
    }
}
