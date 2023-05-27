package com.gitmayconn.kafkaconsumerandproducerwithjava.services;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.gitmayconn.kafkaconsumerandproducerwithjava.models.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumer {

	@KafkaListener(topics = "${app.kafka-topic}", groupId = "${app.kafka-group}")
	public void consumer(ConsumerRecord<String, Product> data) {
		 
		 Product product;
		 
		 try {
			 product = data.value(); 
		 }catch(Exception e) {
			 log.error("An error occurred while trying to retrieve the product. Error: " + e);
			 return ;
		 }
		 
		 if(product != null) {
			 log.info(product.toString());
		 }
		
		
	}

}
