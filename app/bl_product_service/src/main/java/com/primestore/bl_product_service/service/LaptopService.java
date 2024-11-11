package com.primestore.bl_product_service.service;

import com.primestore.bl_product_service.domain.Laptop;
import com.primestore.bl_product_service.dto.LaptopDto;
import com.primestore.bl_product_service.mapper.LaptopMapper;
import com.primestore.bl_product_service.repository.LaptopRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Service
@RequiredArgsConstructor
public class LaptopService {
    private final LaptopRepo repo;
    private final LaptopMapper mapper;

    public List<LaptopDto> getAll() {
        return mapper.toDto(repo.findAll());
    }

    public void decrement(int id, int count) {
        Laptop laptop = repo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Laptop not found by id: " + id));
        if (laptop.getCount() - count < 0) {
            throw new RuntimeException("Laptop count exceeds limit");
        }
        laptop.setCount(laptop.getCount() - count);
        repo.save(laptop);
    }

    public void increment(int id, int count) {
        Laptop laptop = repo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Laptop not found by id: " + id));
        if (count < 0) {
            throw new RuntimeException("increment count less than zero");
        }
        laptop.setCount(laptop.getCount() + count);
        repo.save(laptop);
    }

    public LaptopDto getById(int id) {
        return mapper.toDto(repo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Laptop not found by id: " + id)));
    }
}
