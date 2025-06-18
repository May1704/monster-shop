package com.monster.shop.services;

import com.monster.shop.models.Product;
import com.monster.shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    //Get a product by ID
    public Product getProductsById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }
}
