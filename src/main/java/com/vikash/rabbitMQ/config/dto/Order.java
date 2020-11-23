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
public class Order implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private String orderId;
private String name;
private String qty;
private String price;

}
