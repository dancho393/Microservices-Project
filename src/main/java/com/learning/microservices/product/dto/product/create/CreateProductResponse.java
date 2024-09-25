package com.learning.microservices.product.dto.product.create;

import com.learning.microservices.product.dto.base.OperationResponse;

import java.math.BigDecimal;

public record CreateProductResponse(
    String message,
    String id,
    String name,
    String description,
    String price
) implements OperationResponse {
}
