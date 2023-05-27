package com.gitmayconn.kafkaconsumerandproducerwithjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaConsumerAndProducerWithJavaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerAndProducerWithJavaApplication.class, args);
	}

}
