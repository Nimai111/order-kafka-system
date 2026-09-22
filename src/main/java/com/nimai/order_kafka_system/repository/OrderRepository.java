package com.nimai.order_kafka_system.repository;

import com.nimai.order_kafka_system.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}