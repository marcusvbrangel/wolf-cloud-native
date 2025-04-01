package com.mvbr.wolfstorepayment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public record ProductRequest(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("description") String description,
        @JsonProperty("quantity") int quantity,
        @JsonProperty("price") BigDecimal price,
        @JsonProperty("isActive") boolean isActive
) {}
