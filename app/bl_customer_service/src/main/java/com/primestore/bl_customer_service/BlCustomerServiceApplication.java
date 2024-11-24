package com.primestore.bl_customer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BlCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlCustomerServiceApplication.class, args);
    }

}
