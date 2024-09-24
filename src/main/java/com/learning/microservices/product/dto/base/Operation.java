package com.learning.microservices.product.dto.base;

public interface Operation <I extends OperationRequest,O extends OperationResponse>{
    O process(I request);
}
