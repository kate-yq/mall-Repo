package com.example.shoppingPlatform.controller;

import com.example.shoppingPlatform.Response;
import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductCategory;
import com.example.shoppingPlatform.service.UserOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GeneralController {
  @Autowired
  private UserOperation userOP;

  /**
   * get all products
   */
  @RequestMapping(value = "/products", method = RequestMethod.GET)
  public @ResponseBody Response allProducts() {
    List<Product> contentResult = userOP.getProducts();
    return Response.success(contentResult, "get all products successfully");
  }

  /**
   * get 1 product by ID
   */
  @RequestMapping(value = "/products/{productID}", method = RequestMethod.GET)
  public @ResponseBody Response productByID(@PathVariable Long productID) {
    Product contentResult = userOP.getProductById(productID);
    return Response.success(contentResult, "get product with id:" + productID);
  }

  /**
   * get all categories
   */
  @RequestMapping(value = "/categories", method = RequestMethod.GET)
  public @ResponseBody Response content() {
    List<ProductCategory> contentResult = userOP.getCategories();
    return Response.success(contentResult, "get all categories successfully");
  }

  /**
   * get all products in a category by ID
   */
  @RequestMapping(value = "/categories/{categoryID}", method = RequestMethod.GET)
  public @ResponseBody Response getProductCateList(@PathVariable Long categoryID) {
    List<Product> contentResult = userOP.getCategoryByID(categoryID);
    return Response.success(contentResult, "get all products under category:" + categoryID);
  }

  /**
   * get all orders of a user by usrID
   */
  @RequestMapping(value = "/orders/{usrID}", method = RequestMethod.GET)
  public @ResponseBody Response getAllOrders(@PathVariable Long usrID) {
    List<Order> contentResult = userOP.getOrderByUsrID(usrID);
    return Response.success(contentResult, "get all orders of user:" + usrID);
  }

  /**
   * place order
   */
  @RequestMapping(value = "/orders", method = RequestMethod.POST)
  public @ResponseBody Response placeOrder(@RequestBody Order order,
                                           @RequestHeader("usrID") String usrID) {
    order.setUsrId(Long.valueOf(usrID));
    userOP.placeOrder(order);
    return Response.success(null, "successfully placed order" + usrID);
  }
}
