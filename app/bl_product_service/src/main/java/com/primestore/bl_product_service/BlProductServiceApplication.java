package com.primestore.bl_product_service;

import com.primestore.bl_product_service.domain.*;
import com.primestore.bl_product_service.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BlProductServiceApplication {
    private final ProductService productService;
    public static void main(String[] args) {
        SpringApplication.run(BlProductServiceApplication.class, args);
    }

    @PostConstruct
    public void sampleDataInsert() {
        Dimension dimension1 = new Dimension();
        dimension1.setUnit(Dimension.DimensionUnit.CM);
        Weight weight1 = new Weight();
        weight1.setUnit(Weight.WeightUnit.MG);

        Dimension dimension2 = new Dimension();
        dimension2.setUnit(Dimension.DimensionUnit.CM);
        Weight weight2 = new Weight();
        weight2.setUnit(Weight.WeightUnit.MG);

        Battery battery1 = new Battery().builder().capacity(4000).build();
        Battery battery2 = new Battery().builder().capacity(25000).build();
        Phone as1 =
                new Phone().builder().count(5).name("phone").productCode(222).innerPrice(22).outerPrice(22).warranty(2).dimension(dimension1).weight(weight1).ramSize(16).battery(battery1).build();
        productService.addProduct(as1);

        Laptop la1 =
                new Laptop().builder().count(5).name("laptop").productCode(222).innerPrice(22).outerPrice(22).warranty(2).dimension(dimension2).weight(weight2).battery(battery2).build();
        productService.addProduct(la1);
//        List<Product> allProducts = productService.getAllProducts();
//        for (Product product : allProducts) {
//            System.out.println(product);
//        }
    }

}
