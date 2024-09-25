package com.learning.microservices.product.service.product;

import com.learning.microservices.product.dto.product.getall.GetAllProductsOperation;
import com.learning.microservices.product.dto.product.getall.GetAllProductsRequest;
import com.learning.microservices.product.dto.product.getall.GetAllProductsResponse;
import com.learning.microservices.product.model.Product;
import com.learning.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class GetAllProductsService implements GetAllProductsOperation {
    private final ProductRepository productRepository;


    @Override
    public GetAllProductsResponse process(GetAllProductsRequest request) {
        int pageSize = 10;
        Pageable pageable = PageRequest.of(request.page(), pageSize);
        Page<Product> productPage = productRepository.findAll(pageable);

        return new GetAllProductsResponse(productPage);
    }
}
