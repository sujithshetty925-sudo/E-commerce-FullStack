package com.sujith.ecommerce.service;

import com.sujith.ecommerce.entity.Order;
import com.sujith.ecommerce.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order>getAllOrders();
    Optional <Order> getOrderById(Long id);
    Order updateOrder(Long id,Order order);
    void deleteOrder(Long id);

}
