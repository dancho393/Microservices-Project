package com.learning.microservices.product.dto.product.getall;

import com.learning.microservices.product.dto.base.OperationResponse;
import com.learning.microservices.product.model.Product;
import org.springframework.data.domain.Page;

public record GetAllProductsResponse(
    Page<Product> products
) implements OperationResponse {
}
