package com.learning.microservices.product.dto.product.getall;

import com.learning.microservices.product.dto.base.OperationRequest;

public record GetAllProductsRequest(
        int page
) implements OperationRequest {
}
