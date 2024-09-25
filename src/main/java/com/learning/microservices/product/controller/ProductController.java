package com.learning.microservices.product.controller;


import com.learning.microservices.product.dto.product.create.CreateProductRequest;
import com.learning.microservices.product.dto.product.create.CreateProductResponse;
import com.learning.microservices.product.dto.product.getall.GetAllProductsRequest;
import com.learning.microservices.product.dto.product.getall.GetAllProductsResponse;
import com.learning.microservices.product.model.Product;
import com.learning.microservices.product.service.product.CreateProductService;
import com.learning.microservices.product.service.product.GetAllProductsService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final CreateProductService createProductService;
    private final GetAllProductsService getAllProductsService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CreateProductResponse> createProduct(
            @RequestBody CreateProductRequest productRequest
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createProductService.process(productRequest));
    }
    @GetMapping("/{page}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GetAllProductsResponse> getAllProducts(
            @PathVariable int page) {
        GetAllProductsRequest request = new GetAllProductsRequest(page);
        return ResponseEntity.ok().body(getAllProductsService.process(request));
    }
}
