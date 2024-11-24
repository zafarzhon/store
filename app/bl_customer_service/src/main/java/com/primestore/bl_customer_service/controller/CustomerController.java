package com.primestore.bl_customer_service.controller;

import com.primestore.bl_customer_service.domain.Customer;
import com.primestore.bl_customer_service.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/add")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @GetMapping("/list")
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/by-login/{login}")
    public Customer getCustomerByLogin(@PathVariable String login) {
        return customerService.getCustomerByLogin(login);
    }
}
