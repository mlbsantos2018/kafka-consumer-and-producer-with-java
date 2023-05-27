package com.gitmayconn.kafkaconsumerandproducerwithjava.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class KafkaProducer {

    @Value("${app.kafka-topic}")
    private String topico;

	private final KafkaTemplate<Object, Object> kafkaTemplate;
	
    public <T> void create(T dados) {
    	kafkaTemplate.send(topico, dados);
    }

}
