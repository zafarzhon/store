package com.primestore.il_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

@Component
@FeignClient(name = "OrderClient", url = "${app.feign.customer.url}", path = "/order")
public interface OrderClient {

    @PostMapping("/make")
//    @Headers(value = "Content-Type: application/json")
    ResponseEntity<String> makeOrder(@RequestParam(name = "login") String login,
                                     @RequestParam(name = "cartJson") String cartJson);
}