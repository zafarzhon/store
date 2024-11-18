package com.primestore.il_service.client;

import com.primestore.il_service.dto.SmartphoneDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Component
@FeignClient(name = "smartphoneClient", url = "${app.feign.product.url}", path = "${app.feign.path.smartphones}")
public interface SmartphoneClient {
    @GetMapping("/list")
    List<SmartphoneDto> getAll();

    @GetMapping("/{id}/increment/{count}")
    void increment(@PathVariable int id, @PathVariable int count);

    @GetMapping("{id}/decrement/{count}")
    void decrement(@PathVariable int id, @PathVariable int count);

    @GetMapping("/{id}")
    SmartphoneDto getById(@PathVariable int id);
}
