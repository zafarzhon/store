package com.primestore.il_service.service;

import com.primestore.il_service.client.CustomerClient;
import com.primestore.il_service.dto.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class CustomerService{
    private final CustomerClient client;
    private final PasswordEncoder passwordEncoder;


    public Customer save(Customer customer) {
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return client.save(customer);
    }

    public Customer findByUsername(String username) {
        return client.getCustomerByLogin(username);
    }

    public UserDetailsService userDetailsService() {
        return this::findByUsername;
    }

}
