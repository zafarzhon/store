package com.primestore.il_service.controller;

import com.primestore.il_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/make")
    public String doOrder(@RequestHeader(value = "Cookie", required = false) String cookies) {
        Boolean b = orderService.doOrder(cookies);
        System.out.println();
        if (b) {
            return "redirect:/success";
        }else {
            return "redirect:/error";
        }
    }
}
