package com.izdebski.RestService.repository;

import com.izdebski.RestService.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}