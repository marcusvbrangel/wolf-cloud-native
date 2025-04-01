package com.mvbr.wolfstorepayment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ProductResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

//    @JsonProperty("description")
//    private String description;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private BigDecimal price;

//    @JsonProperty("isActive")
//    private boolean isActive;

    @JsonProperty("total")
    private BigDecimal total;

    public ProductResponse(ProductRequest productRequest) {
        this.id = productRequest.id();
        this.name = productRequest.name();
//        this.description = productRequest.description();
        this.quantity = productRequest.quantity();
        this.price = productRequest.price();
//        this.isActive = productRequest.isActive();
        this.total = productRequest.price().multiply(BigDecimal.valueOf(productRequest.quantity()));
    }

    // Getters and setters (if needed)
}