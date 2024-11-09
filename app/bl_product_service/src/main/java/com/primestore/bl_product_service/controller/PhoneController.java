package com.primestore.bl_product_service.controller;

import com.primestore.bl_product_service.dto.PhoneDto;
import com.primestore.bl_product_service.service.PhoneService;
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
@RequestMapping("${app.api.path}/phone")
@RequiredArgsConstructor
public class PhoneController {
    private final PhoneService phoneService;

    @GetMapping("/list")
    public List<PhoneDto> getAll() {
        return phoneService.getAll();
    }

}
