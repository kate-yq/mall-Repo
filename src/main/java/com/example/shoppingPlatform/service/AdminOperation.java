package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductCategory;


public interface AdminOperation {

  /**
   * create product
   */
  void createProduct(Product p);

  /**
   * update product
   */
  void updateProduct(Product p);

  /**
   * delete product by ID
   */
  void deleteProductByID(Long id);

  /**
   * create category
   */
  void createCategory(ProductCategory c);

  /**
   * update category
   */
  void updateCategory(ProductCategory c);

  /**
   * delete category by ID
   */
  void deleteCategoryByID(Long id);

  /**
   * get order by ID
   */
  Order getOrder(Long id);

  /**
   * edit order details
   */
  void updateOrder(Order o);
}
