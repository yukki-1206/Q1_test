package com.example.q1_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public Map<String, List<Product>> getProducts() {
        List<Product> products = Arrays.asList(
                new Product(1L, "Sample Product", 1000, 50),
                new Product(2L, "Another Product", 1500, 20)
        );
            Map<String, List<Product>> response = new HashMap<>();
            response.put("products", products);
            return response;
        }
    }