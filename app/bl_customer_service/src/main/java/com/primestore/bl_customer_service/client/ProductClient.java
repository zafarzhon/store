package com.primestore.bl_customer_service.client;

import com.primestore.bl_customer_service.dto.productDtos.SmartphoneDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@FeignClient(name = "ProductClient", url = "127.0.0.1:8081")
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/smartphone/{id}")
    SmartphoneDto getById(@PathVariable(name = "id") int id);
}
