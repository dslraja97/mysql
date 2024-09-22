package com.microservices.order_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.microservices.order_service.dto.OrderLineItemDto;
import com.microservices.order_service.dto.OrderRequest;
import com.microservices.order_service.model.Order;
import com.microservices.order_service.model.OrderLineItem;
import com.microservices.order_service.repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

	private final OrderRepository orderRepository;

	public void placeOrder(OrderRequest orderRequest) {
		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());
		List<OrderLineItem> orderLineItems = orderRequest.getOrderLineItemDtos().stream().map(this::mapToDto).toList();
		order.setOrderLineItem(orderLineItems);
		orderRepository.save(order);
		log.info("Order is added Succesfully ur orderid is{}", order.getOrderNumber());

	}

	public OrderLineItem mapToDto(OrderLineItemDto orderLineItemDto) {
		OrderLineItem orderLineItem = new OrderLineItem();
		orderLineItem.setId(orderLineItemDto.getId());
		orderLineItem.setItemName(orderLineItemDto.getItemName());
		orderLineItem.setPrice(orderLineItemDto.getPrice());
		orderLineItem.setQuantity(orderLineItemDto.getQuantity());
		return orderLineItem;
	}
}
