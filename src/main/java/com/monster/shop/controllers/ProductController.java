package com.monster.shop.controllers;

import com.monster.shop.models.Product;
import com.monster.shop.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //Get all products
    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/api/products/{productId}")
    public Product getProductsById(@PathVariable Long productId) {
        return productService.getProductsById(productId);
    }

    @PostMapping("/api/products")
    public void addProduct(@RequestBody Product newProduct){
        productService.addProduct(newProduct);
    }

    @PutMapping("/api/products/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/api/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
