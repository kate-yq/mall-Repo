package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductCategory;
import com.example.shoppingPlatform.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import jakarta.annotation.Resource;

@Service
public class UserOperationImpl implements UserOperation{
  @Autowired
  ProductService productService;
  @Autowired
  ProductCategoryService productCategoryService;
  @Autowired
  OrderService orderService;
  @Autowired
  UserService userService;


  /**
   * change user information
   *
   * @param user
   */
  @Override
  public void updateUser(User user) {
    userService.updateUser(user);
  }

  /**
   * get all products
   */
  @Override
  public List<Product> getProducts() {
    return productService.getAllProduct();
  }

  /**
   * get 1 product by ID
   *
   * @param id
   */
  @Override
  public Product getProductById(long id) {
    return productService.getProductById(id);
  }

  /**
   * get all categories
   */
  @Override
  public List<ProductCategory> getCategories() {
    return productCategoryService.getAllProductCategory();
  }

  /**
   * get all products in a category by ID
   *
   * @param categoryID
   */
  @Override
  public List<Product> getCategoryByID(Long categoryID) {
    return productService.getProductsByCategoryId(categoryID);
  }

  /**
   * get all orders of a user using usrID
   *
   * @param usrID
   */
  @Override
  public List<Order> getOrderByUsrID(Long usrID) {
    return orderService.getOrdersByUsrId(usrID);
  }

  /**
   * place order
   *
   * @param o
   */
  @Override
  public void placeOrder(Order o) {
    orderService.saveOrder(o);
  }
}
