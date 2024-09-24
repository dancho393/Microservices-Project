package com.learning.microservices.product.controller;


import com.learning.microservices.product.dto.product.create.CreateProductRequest;
import com.learning.microservices.product.dto.product.create.CreateProductResponse;
import com.learning.microservices.product.service.CreateProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final CreateProductService createProductService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CreateProductResponse> createProduct(
            @RequestBody CreateProductRequest productRequest
    ) {
        return ResponseEntity.ok().body(createProductService.process(productRequest));
    }
}
