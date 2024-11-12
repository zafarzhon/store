package com.primestore.il_service.client;

import com.primestore.il_service.dto.LaptopDto;
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
@FeignClient(name = "laptopClient", url = "${app.feign.url}", path = "${app.feign.path.laptops}")
public interface LaptopClient {
    @GetMapping("/list")
    List<LaptopDto> getAll();

    @GetMapping("/{id}/increment/{count}")
    void increment(@PathVariable int id, @PathVariable int count);

    @GetMapping("{id}/decrement/{count}")
    void decrement(@PathVariable int id, @PathVariable int count);

    @GetMapping("/{id}")
    LaptopDto getById(@PathVariable int id);
}
