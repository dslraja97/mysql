package com.microservices.order_service.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * this is the order Request bean class.
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

	private List<OrderLineItemDto> orderLineItemDtos;
}
