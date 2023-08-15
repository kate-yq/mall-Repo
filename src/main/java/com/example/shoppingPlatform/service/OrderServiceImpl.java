package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Order;
import com.example.shoppingPlatform.model.OrderPO;
import com.example.shoppingPlatform.repository.OrderRepository;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService{
  @Resource
  private OrderRepository orderRepository;
  @Override
  public void saveOrder(Order order) {
    Mapper mapper = new DozerBeanMapper();
    OrderPO orderPO = mapper.map(order, OrderPO.class);
    orderRepository.save(orderPO);
  }

  @Override
  public void updateOrder(Order order) {
    Mapper mapper = new DozerBeanMapper();
    OrderPO orderPO = mapper.map(order, OrderPO.class);
    orderRepository.save(orderPO);
  }

  @Override
  public Order getOrderById(Long id) {
    Mapper mapper = new DozerBeanMapper();
    Optional<OrderPO> orderPO = orderRepository.findById(id);
    return mapper.map(orderPO, Order.class);
  }

  @Override
  public List<Order> getOrdersByUsrId(Long id) {
    Mapper mapper = new DozerBeanMapper();
    List<OrderPO> orderPOs = orderRepository.findAll();
    List<Order> res = new ArrayList<>();
    for (OrderPO o : orderPOs){
      if (o.getUsrId() == id){
        res.add(mapper.map(o, Order.class));
      }
    }
    return res;
  }
}
