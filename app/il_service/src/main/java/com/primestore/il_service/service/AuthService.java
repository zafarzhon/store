package com.primestore.il_service.service;

import com.primestore.il_service.dto.AuthRequestDto;
import com.primestore.il_service.dto.AuthResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class AuthService {
    private final CustomerService customerService;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    public AuthResponseDto auth(AuthRequestDto authRequestDto) {
        UserDetails userDetails = customerService.userDetailsService().loadUserByUsername(authRequestDto.getLogin());
        if (!passwordEncoder.matches(authRequestDto.getPassword(), userDetails.getPassword())) {
            throw new RuntimeException("Invalid password");
        }
        return new AuthResponseDto(tokenService.createToken(userDetails));
    }

}
