package com.trade_wise.trade_wise.repository;

import com.trade_wise.trade_wise.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    Order findOrderById(String id);
    List<Order> findAll();
}
