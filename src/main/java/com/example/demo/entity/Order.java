package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Persistence Annotations
@Entity
@Table(name = "orders_2021")
public class Order {

	private Integer orderId;
	private String customerName;
	private String shippingAddress;
	private String item;
	private Double orderValue;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDate orderDate;
}
