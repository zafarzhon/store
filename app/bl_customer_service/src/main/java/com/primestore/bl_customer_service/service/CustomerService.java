package com.primestore.bl_customer_service.service;

import com.primestore.bl_customer_service.domain.Customer;
import com.primestore.bl_customer_service.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepo;

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }


    public Customer findById(Integer id) {
        return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Customer getCustomerByLogin(String login) {
        return customerRepo.
                findByLogin(login).
                orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
