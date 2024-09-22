package com.microservices.order_service.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * this is the orderlistItem bean class for the mysql table will be configured like this .
 * */
@Entity
@Table(name = "orderLineItem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String itemName;
	private BigDecimal price;
	private int quantity;
}
