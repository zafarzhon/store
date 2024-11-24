package com.primestore.bl_customer_service.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.primestore.bl_customer_service.client.ProductClient;
import com.primestore.bl_customer_service.domain.Customer;
import com.primestore.bl_customer_service.domain.Order;
import com.primestore.bl_customer_service.domain.Product;
import com.primestore.bl_customer_service.dto.productDtos.ProductDto;
import com.primestore.bl_customer_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Service
@RequiredArgsConstructor
public class OrderService {
    private final CustomerService customerService;
    private final ProductClient productClient;
    private final OrderRepository orderRepository;

    public Customer makeOrder(String login, String cartJson) {
        Customer customer = customerService.getCustomerByLogin(login);
        Order order = new Order();
        try {
            // Создаем ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Парсим JSON в JsonNode
            JsonNode rootNode = objectMapper.readTree(cartJson);

            // Итерируем по всем ключам и значениям
            Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                int id = Integer.parseInt(field.getKey()); // Ключ
                int qty = field.getValue().asInt(); // Значение
                ProductDto byId = productClient.getById(id);
                Product product = new Product();
                product.setProductId(id);
                product.setQuantity(qty);
                product.setPrice(byId.getPriceWithDiscount());
                order.addProduct(product);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        customer.addOrder(order);
        orderRepository.save(order);
        return customerService.save(customer);
    }


}
