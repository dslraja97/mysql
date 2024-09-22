package com.microservices.order_service.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * this is the orderlist of item for the bean class for the backend.
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemDto {

	private long id;

	private String itemName;
	private BigDecimal price;
	private int quantity;
}
