package com.learning.microservices.product.dto.product.create;

import com.learning.microservices.product.dto.base.Operation;

public interface CreateProductOperation
        extends Operation<CreateProductRequest, CreateProductResponse> {

    CreateProductResponse process(CreateProductRequest request);
}
