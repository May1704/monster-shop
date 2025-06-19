package com.monster.shop.repositories;

import com.monster.shop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteProductsById(Long id);
}
