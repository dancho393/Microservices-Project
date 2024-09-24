package com.learning.microservices.product.dto.product.create;

import com.learning.microservices.product.dto.base.OperationRequest;

import java.math.BigDecimal;

public record CreateProductRequest (
        String id,
        String name,
        String description,
        BigDecimal price)
        implements OperationRequest {
}
