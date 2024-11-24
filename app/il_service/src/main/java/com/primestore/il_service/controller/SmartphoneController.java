package com.primestore.il_service.controller;

import com.primestore.il_service.client.SmartphoneClient;
import com.primestore.il_service.dto.SmartphoneDto;
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
@RequestMapping("/smartphones")
@RequiredArgsConstructor
public class SmartphoneController {
    private final SmartphoneClient smartphoneClient;

    @GetMapping
    public String smartphones(Model model) {
        List<SmartphoneDto> all = smartphoneClient.getAll();
        model.addAttribute("smartphones", all);
        return "smartphones";
    }

    @GetMapping("/{id}")
    public String smartphoneById(@PathVariable int id, Model model) {
        SmartphoneDto smartphoneDto = smartphoneClient.getById(id);
        model.addAttribute("smartphone", smartphoneDto);
        return "smartphone";
    }


}
