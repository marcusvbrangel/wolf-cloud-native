package com.mvbr.wolfstore.dto;

import java.math.BigDecimal;

public record ProductResponse(
        String id,
        String name,
        String description,
        int quantity,
        BigDecimal price,
        boolean isActive
) {}
