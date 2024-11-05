package com.itallume.course.repositories;

import com.itallume.course.entities.Order;
import com.itallume.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
