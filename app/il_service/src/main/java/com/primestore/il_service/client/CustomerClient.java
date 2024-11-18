package com.primestore.il_service.client;

import com.primestore.il_service.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Component
@FeignClient(name = "CustomerClient", url = "${app.feign.customer.url}", path = "${app.feign.path.customers}")
public interface CustomerClient {

    @GetMapping("/by-login/{login}")
    CustomerDto getCustomerByLogin(@PathVariable String login);
}
