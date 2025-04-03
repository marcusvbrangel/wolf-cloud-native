package com.mvbr.wolfstore.products.dto;

import java.math.BigDecimal;

public record ProductResponse(
        String id,
        String name,
        String description,
        int quantity,
        BigDecimal price,
        boolean isActive
) {}
