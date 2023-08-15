package com.example.shoppingPlatform.repository;

import com.example.shoppingPlatform.model.OrderPO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderPO, Long> {
}
