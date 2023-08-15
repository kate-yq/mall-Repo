package com.example.shoppingPlatform.controller;

import com.example.shoppingPlatform.Response;
import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductCategory;
import com.example.shoppingPlatform.service.AdminOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
  @Autowired
  AdminOperation adminOP;

  /**
   * post new product
   */
  @RequestMapping(value = "/products", method = RequestMethod.POST)
  public @ResponseBody Response postProduct(@RequestBody Product product,
                                            @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.createProduct(product);
    return Response.success(null, "successfully create product");
  }

  /**
   * put new product
   */
  @RequestMapping(value = "/products", method = RequestMethod.PUT)
  public @ResponseBody Response putProduct(@RequestBody Product product,
                                           @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.updateProduct(product);
    return Response.success(null, "successfully update product");
  }

  /**
   * delete product by ID
   */
  @RequestMapping(value = "/products/{productID}", method = RequestMethod.DELETE)
  public @ResponseBody Response deleteProductByID(@PathVariable Long productID,
                                                  @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.deleteProductByID(productID);
    return Response.success(null, "successfully delete product:" + productID);
  }

  /**
   * post new category
   */
  @RequestMapping(value = "/categories", method = RequestMethod.POST)
  public @ResponseBody Response postCategory(@RequestBody ProductCategory category,
                                             @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.updateCategory(category);
    return Response.success(null, "successfully create category");
  }

  /**
   * put new category
   */
  @RequestMapping(value = "/categories", method = RequestMethod.PUT)
  public @ResponseBody Response putCategory(@RequestBody ProductCategory category,
                                            @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.updateCategory(category);
    return Response.success(null, "successfully update category");
  }


  /**
   * delete category by ID
   */
  @RequestMapping(value = "/categories/{categoryID}", method = RequestMethod.DELETE)
  public @ResponseBody Response deleteCategoryByID(@PathVariable Long categoryID,
                                                   @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.deleteCategoryByID(categoryID);
    return Response.success(null, "successfully delete category:" + categoryID);
  }

  /**
   * get order by ID
   */
  @RequestMapping(value = "/orders/{orderID}", method = RequestMethod.GET)
  public @ResponseBody Response getOrder(@PathVariable Long orderID,
                                         @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    Order result = adminOP.getOrder(orderID);
    return Response.success(result, "successfully get the order:" + orderID);
  }

  /**
   * put new order
   */
  @RequestMapping(value = "/orders", method = RequestMethod.PUT)
  public @ResponseBody Response putOrder(@RequestBody Order order,
                                         @RequestHeader("usrName") String usrName){
    if (!usrName.equals("admin")){
      return Response.failed(null, "Access forbidden");
    }
    adminOP.updateOrder(order);
    return Response.success(null, "successfully update product");
  }
}