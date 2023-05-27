package com.gitmayconn.kafkaconsumerandproducerwithjava.models;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int id;
	private String description;
	private BigDecimal price;

}
