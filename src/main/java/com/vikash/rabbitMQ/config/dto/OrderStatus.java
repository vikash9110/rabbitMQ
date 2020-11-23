package com.vikash.rabbitMQ.config.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Order order;
	private String status;
	private String message;
}
