package com.microservices.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.order_service.model.Order;
/*
 * Order repository is an interface this interface will extends the JPA respository to get all the default methoud in the Mysql.
 * */

public interface OrderRepository extends JpaRepository<Order, Long> {

}
