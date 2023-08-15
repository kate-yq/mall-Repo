package com.example.shoppingPlatform.repository;

import com.example.shoppingPlatform.model.ProductCategoryPO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryPO, Long> {
}
