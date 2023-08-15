package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.Response;
import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductCategory;

import org.springframework.beans.factory.annotation.Autowired;

public class AdminOperationImpl implements AdminOperation{
  @Autowired
  ProductService productService;
  @Autowired
  ProductCategoryService productCategoryService;
  @Autowired
  OrderService orderService;
  @Autowired
  UserService userService;


  /**
   * create product
   *
   * @param p
   */
  @Override
  public void createProduct(Product p) {
    productService.createProduct(p);
  }

  /**
   * create/edit product
   *
   * @param p
   */
  @Override
  public void updateProduct(Product p) {
    productService.updateProduct(p);
  }

  /**
   * delete product by ID
   *
   * @param id
   */
  @Override
  public void deleteProductByID(Long id) {
    productService.deleteProduct(id);
  }

  /**
   * create category
   *
   * @param c
   */
  @Override
  public void createCategory(ProductCategory c) {
    productCategoryService.createProductCategory(c);
  }

  /**
   * create category
   *
   * @param c
   */
  @Override
  public void updateCategory(ProductCategory c) {
    productCategoryService.updateProductCategory(c);
  }

  /**
   * delete category by ID
   *
   * @param id
   */
  @Override
  public void deleteCategoryByID(Long id) {
    productCategoryService.deleteProductCategory(id);
  }

  /**
   * get order by ID
   *
   * @param id
   */
  @Override
  public Order getOrder(Long id) {
    return orderService.getOrderById(id);
  }

  /**
   * edit order details
   *
   * @param o
   */
  @Override
  public void updateOrder(Order o) {
    orderService.updateOrder(o);
  }
}
