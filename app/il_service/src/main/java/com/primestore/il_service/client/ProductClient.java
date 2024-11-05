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
@FeignClient(name = "productClient", url = "${app.feign.url}", path = "${app.feign.path}")
public interface ProductClient {
    @GetMapping("/phone/list")
    List<Phone> getPhoneList();

    @GetMapping("/laptop/list")
    List<Laptop> getLaptopList();
}
