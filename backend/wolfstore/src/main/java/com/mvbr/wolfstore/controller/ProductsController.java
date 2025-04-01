package com.mvbr.wolfstore.controller;

import com.mvbr.wolfstore.dto.ProductResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
//@CrossOrigin("http://localhost:4200")
@CrossOrigin("http://10.110.54.238:8090/")
public class ProductsController {

    private List<ProductResponse> products;

    @PostConstruct
    public void init() {
        products = this.generateProducts();
    }

    @RequestMapping("/")
    public String initialPage() {
        return "Welcome to the WolfStore API!";
    }

    @RequestMapping("/api/v1/products")
    public ResponseEntity<List<ProductResponse>> getProducts() {
        return ResponseEntity.ok(products);
    }

    @RequestMapping("/api/v1/products/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable String id) {
        return products.stream()
                .filter(product -> product.id().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    private List<ProductResponse> generateProducts() {

        List<ProductResponse> productList = new ArrayList<>();

        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Auto Rádio", "Bosh 13ABS", 29, BigDecimal.valueOf(115.12), true));
        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Apple iPhone 13", "Latest model of iPhone", 50, BigDecimal.valueOf(999.99), true));
        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Samsung Galaxy S21", "Latest model of Samsung Galaxy", 30, BigDecimal.valueOf(799.99), true));
        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Sony WH-1000XM4", "Noise cancelling headphones", 100, BigDecimal.valueOf(349.99), false));
        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Dell XPS 13", "High performance laptop", 20, BigDecimal.valueOf(1199.99), true));
        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Apple Watch Series 7", "Latest model of Apple Watch", 70, BigDecimal.valueOf(399.99), false));

        for (int i = 6; i <= 40; i++) {
            productList.add(new ProductResponse(
                    UUID.randomUUID().toString(),
                    "Product " + i,
                    "Description for product " + i,
                    i * 10,
                    BigDecimal.valueOf(i * 10.0),
                    i % 2 == 0
            ));
        }

        return productList;
    }

}
