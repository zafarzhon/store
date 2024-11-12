package com.primestore.il_service.controller;

import com.primestore.il_service.client.LaptopClient;
import com.primestore.il_service.dto.LaptopDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Controller
@RequestMapping("/laptops")
@RequiredArgsConstructor
public class LaptopController {
    private final LaptopClient laptopClient;

    @GetMapping
    public String laptops(Model model) {
        List<LaptopDto> all = laptopClient.getAll();
        model.addAttribute("laptops", all);
        return "laptops";
    }

    @GetMapping("/{id}")
    public String laptopById(@PathVariable int id, Model model) {
        LaptopDto laptopDto = laptopClient.getById(id);
        model.addAttribute("laptop", laptopDto);
        return "laptop";
    }
}
