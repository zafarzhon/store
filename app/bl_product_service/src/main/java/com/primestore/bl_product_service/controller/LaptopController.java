package com.primestore.bl_product_service.controller;

import com.primestore.bl_product_service.dto.LaptopDto;
import com.primestore.bl_product_service.service.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@RestController
@RequestMapping("/laptop")
@RequiredArgsConstructor
public class LaptopController {
    private final LaptopService service;

    @GetMapping("/list")
    public List<LaptopDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}/increment/{count}")
    public void increment(@PathVariable int id, @PathVariable int count) {
        service.increment(id, count);
    }

    @GetMapping("{id}/decrement/{count}")
    public void decrement(@PathVariable int id, @PathVariable int count) {
        service.decrement(id, count);
    }

    @GetMapping("/{id}")
    public LaptopDto getById(@PathVariable int id) {
        return service.getById(id);
    }

}
