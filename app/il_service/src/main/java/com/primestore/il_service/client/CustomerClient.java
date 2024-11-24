package com.primestore.il_service.client;

import com.primestore.il_service.dto.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Component
@FeignClient(name = "CustomerClient", url = "${app.feign.customer.url}", path = "${app.feign.path.customers}")
public interface CustomerClient {

    @PostMapping("/add")
    Customer save(@RequestBody Customer customer);

    @GetMapping("/by-login/{login}")
    Customer getCustomerByLogin(@PathVariable String login);
}
