package com.example.shoppingPlatform.repository;

import com.example.shoppingPlatform.model.ProductPO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductPO, Long> {
}
