package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductCategory;
import com.example.shoppingPlatform.model.User;

import java.util.List;

public interface UserOperation {
  /**
   * change user information
   */
  void updateUser(User user);

  /**
   * get all products
   */
  List<Product> getProducts();

  /**
   * get 1 product by ID
   */
  Product getProductById(long id);

  /**
   * get all categories
   */
  List<ProductCategory> getCategories();

  /**
   * get all products in a category by ID
   */
  List<Product> getCategoryByID(Long categoryID);

  /**
   * get all orders of a user using usrID
   */
  List<Order> getOrderByUsrID(Long usrID);

  /**
   * place order
   */
  void placeOrder(Order o);
}
