package com.monster.shop.services;

import com.monster.shop.models.Product;
import com.monster.shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductsById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not found with ID: " + id));
    }
    public Product addProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }
    public Product update(Long id, Product updatedProduct) {
        Product existing = getProductsById(id);
        existing.setName(updatedProduct.getName());
        existing.setPrice(updatedProduct.getPrice());
        existing.setImageUrl(updatedProduct.getImageUrl());
        existing.setRating(updatedProduct.getRating());
        existing.setReviewCount(updatedProduct.getReviewCount());
        existing.setFeatured(updatedProduct.isFeatured());
        return productRepository.save(existing);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
