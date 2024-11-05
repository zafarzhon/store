package com.primestore.il_service.client;

import com.primestore.il_service.domain.Laptop;
import com.primestore.il_service.domain.Phone;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Component
@FeignClient(name = "productClient", url = "127.0.0.1:8080", path = "/api/v1")
public interface ProductClient {
    @GetMapping("/phone/list")
    List<Phone> getPhoneList();

    @GetMapping("/laptop/list")
    List<Laptop> getLaptopList();
}
