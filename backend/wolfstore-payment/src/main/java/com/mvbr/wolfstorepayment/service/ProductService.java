package com.mvbr.wolfstorepayment.service;

import com.mvbr.wolfstorepayment.dto.ProductRequest;
import com.mvbr.wolfstorepayment.dto.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    private static final String API_URL = "http://localhost:8080/api/v1/products";
    private static final String API_URL = "http://wolfstore-products-service:8096/api/v1/products";

//    public List<ProductRequest> getProducts() {
//        return restTemplate.getForObject(API_URL, List.class);
//    }

    public List<ProductResponse> getProducts() {
        ResponseEntity<ProductRequest[]> result = restTemplate.getForEntity(API_URL, ProductRequest[].class);
        return Arrays.stream(Objects.requireNonNull(result.getBody()))
                .map(ProductResponse::new)
                .collect(Collectors.toList());
    }

}
