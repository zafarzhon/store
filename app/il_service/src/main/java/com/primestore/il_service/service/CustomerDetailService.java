package com.primestore.il_service.service;

import com.primestore.il_service.client.CustomerClient;
import com.primestore.il_service.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class CustomerDetailService implements UserDetailsService {
    private final CustomerClient customerClient;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomerDto customerByLogin = customerClient.getCustomerByLogin(username);
        return customerByLogin;
    }
}
