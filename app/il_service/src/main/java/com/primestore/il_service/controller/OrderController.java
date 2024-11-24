package com.primestore.il_service.controller;

import com.primestore.il_service.dto.Customer;
import com.primestore.il_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        if (b) {

            return "redirect:/order/success";
        } else {
            return "redirect:/order/fail";
        }
    }

    @GetMapping("/history")
    public String doHistory(Model model) {
        Customer customer = orderService.getCustomer();
        customer.setOrders(customer.getOrders().stream().sorted((o1, o2) -> o1.getCreatedAt().compareTo(o2.getCreatedAt())).toList());
        model.addAttribute("orders", customer.getOrders());
        return "my_orders";
    }
}
