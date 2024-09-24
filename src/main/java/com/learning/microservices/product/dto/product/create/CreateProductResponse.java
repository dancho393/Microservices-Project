package com.learning.microservices.product.dto.product.create;

import com.learning.microservices.product.dto.base.OperationResponse;

public record CreateProductResponse(
    String message
) implements OperationResponse {
}
