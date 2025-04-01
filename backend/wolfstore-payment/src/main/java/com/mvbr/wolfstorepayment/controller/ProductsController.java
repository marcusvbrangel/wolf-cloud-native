package com.mvbr.wolfstorepayment.controller;

import com.mvbr.wolfstorepayment.dto.ProductRequest;
import com.mvbr.wolfstorepayment.dto.ProductResponse;
import com.mvbr.wolfstorepayment.service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:4200")
//@CrossOrigin("http://10.110.54.238:8090/")
public class ProductsController {

    private List<ProductRequest> products;

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    public void init() {
//        products = this.generateProducts();
    }

    @RequestMapping("/")
    public String initialPage() {
        return "Welcome to the WolfStore Payment API!";
    }

    @RequestMapping("/api/v2/products")
    public ResponseEntity<List<ProductResponse>> getProducts() {
//        this.products = productService.getProducts();
        return ResponseEntity.ok(productService.getProducts());
//        return null;//productService.getProducts();
//        return restTemplate.getForObject(API_URL, List.class);
    }

//    @RequestMapping("/api/v1/products")
//    public ResponseEntity<List<ProductRequest>> getProducts() {
//        return ResponseEntity.ok(products);
//    }

//    @RequestMapping("/api/v1/products/{id}")
//    public ResponseEntity<ProductRequest> getProductById(@PathVariable String id) {
//        return products.stream()
//                .filter(product -> product.id().equals(id))
//                .findFirst()
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    private List<ProductResponse> generateProducts() {
//
//        List<ProductResponse> productList = new ArrayList<>();
//
//        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Auto Rádio", "Bosh 13ABS", 29, BigDecimal.valueOf(115.12), true));
//        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Apple iPhone 13", "Latest model of iPhone", 50, BigDecimal.valueOf(999.99), true));
//        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Samsung Galaxy S21", "Latest model of Samsung Galaxy", 30, BigDecimal.valueOf(799.99), true));
//        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Sony WH-1000XM4", "Noise cancelling headphones", 100, BigDecimal.valueOf(349.99), false));
//        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Dell XPS 13", "High performance laptop", 20, BigDecimal.valueOf(1199.99), true));
//        productList.add(new ProductResponse(UUID.randomUUID().toString(), "Apple Watch Series 7", "Latest model of Apple Watch", 70, BigDecimal.valueOf(399.99), false));
//
//        for (int i = 6; i <= 40; i++) {
//            productList.add(new ProductResponse(
//                    UUID.randomUUID().toString(),
//                    "Product " + i,
//                    "Description for product " + i,
//                    i * 10,
//                    BigDecimal.valueOf(i * 10.0),
//                    i % 2 == 0
//            ));
//        }
//
//        return productList;
//    }

}
