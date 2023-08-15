package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Order;

import java.util.List;

public interface OrderService {
  void saveOrder(Order order);
  void updateOrder(Order order);
  Order getOrderById(Long id);
  List<Order> getOrdersByUsrId(Long id);
}
