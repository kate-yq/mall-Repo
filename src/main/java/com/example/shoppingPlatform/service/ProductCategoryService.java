package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
  void createProductCategory(ProductCategory productCategory);
  void updateProductCategory(ProductCategory productCategory);
  ProductCategory getProductCategoryById(Long id);
  void deleteProductCategory(Long id);
  List<ProductCategory> getAllProductCategory();
}
