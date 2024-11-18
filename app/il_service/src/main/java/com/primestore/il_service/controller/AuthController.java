package com.primestore.il_service.controller;

import com.primestore.il_service.dto.AuthRequestDto;
import com.primestore.il_service.dto.AuthResponseDto;
import com.primestore.il_service.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseCookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/log-in")
    public String auth(AuthRequestDto authRequestDto, HttpServletResponse response, HttpServletRequest req) {
        AuthResponseDto auth;
        try {
            auth = authService.auth(authRequestDto);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            return "redirect:/";
        }


        ResponseCookie cookie = ResponseCookie.from("access_token", auth.getToken()).
                httpOnly(true).
                secure(true).
                path("/").
                maxAge(7 * 24 * 60 * 60).
                sameSite("Strict").
                build();
        response.addHeader("Set-Cookie", cookie.toString());

        System.out.println();
        return "redirect:/";
    }

    @GetMapping("/log-out")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        ResponseCookie cookie = ResponseCookie.from("access_token", "")
                .httpOnly(true)
                .secure(true)
                .path("/")
                .maxAge(0)
                .sameSite("Strict")
                .build();
        response.addHeader("Set-Cookie", cookie.toString());
        return "redirect:/";
    }

    @PostMapping("/sign-up")
    public String signup(AuthRequestDto authRequestDto, HttpServletResponse response, HttpServletRequest req) {
        return "fast";
    }
}
