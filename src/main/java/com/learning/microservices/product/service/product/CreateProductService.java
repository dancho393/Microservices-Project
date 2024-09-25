package com.learning.microservices.product.service.product;


import com.learning.microservices.product.dto.product.create.CreateProductOperation;
import com.learning.microservices.product.dto.product.create.CreateProductRequest;
import com.learning.microservices.product.dto.product.create.CreateProductResponse;
import com.learning.microservices.product.model.Product;
import com.learning.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProductService implements CreateProductOperation {
    private final ProductRepository productRepository;


    @Override
    public CreateProductResponse process(CreateProductRequest request) {
        Product product = Product.builder()
                .description(request.description())
                .name(request.name())
                .price(request.price())
                .build();
        productRepository.save(product);
        return new CreateProductResponse(
                "Product created",
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice().toString());
    }
}
