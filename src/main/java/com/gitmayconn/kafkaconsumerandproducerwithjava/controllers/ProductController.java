package com.gitmayconn.kafkaconsumerandproducerwithjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitmayconn.kafkaconsumerandproducerwithjava.models.Product;
import com.gitmayconn.kafkaconsumerandproducerwithjava.services.KafkaProducer;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
	
	@Autowired
	private KafkaProducer kafkaProducerService;
	
	@PostMapping("/")
	public ResponseEntity<Product> create(@RequestBody Product product){
		kafkaProducerService.create(product);
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}
}
