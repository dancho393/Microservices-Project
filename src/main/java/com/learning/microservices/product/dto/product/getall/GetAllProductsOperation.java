package com.learning.microservices.product.dto.product.getall;

import com.learning.microservices.product.dto.base.Operation;

public interface GetAllProductsOperation
        extends Operation<GetAllProductsRequest, GetAllProductsResponse> {
    @Override
    GetAllProductsResponse process(GetAllProductsRequest request);
}
