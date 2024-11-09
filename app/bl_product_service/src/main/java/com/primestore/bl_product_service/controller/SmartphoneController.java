package com.primestore.bl_product_service.controller;

import com.primestore.bl_product_service.dto.SmartphoneDto;
import com.primestore.bl_product_service.service.SmartphoneService;
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
@RequestMapping("${app.api.path}/smartphone")
@RequiredArgsConstructor
public class SmartphoneController {
    private final SmartphoneService smartphoneService;

    @GetMapping("/list")
    public List<SmartphoneDto> getAll() {
        return smartphoneService.getAll();
    }

    @GetMapping("/{id}/increment/{count}")
    public void increment(@PathVariable int id, @PathVariable int count) {
        smartphoneService.increment(id, count);
    }

    @GetMapping("{id}/decrement/{count}")
    public void decrement(@PathVariable int id, @PathVariable int count) {
        smartphoneService.decrement(id, count);
    }
}
