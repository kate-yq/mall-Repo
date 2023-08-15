package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Product;

import java.util.List;

public interface ProductService {
  void createProduct(Product product);
  void updateProduct(Product product);
  Product getProductById(Long id);
  void deleteProduct(Long id);

  List<Product> getAllProduct();
  List<Product> getProductsByCategoryId(Long id);
}
