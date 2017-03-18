package com.rabbitmq.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.beans.Product;

@Service
public class MessageConvertingNSendingService {
	
private static final String SIMPLE_QUEUE = "tekgroupproducts";
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void convertMessageNSend(Product product) throws JsonProcessingException{
		ObjectMapper mapper=new ObjectMapper(); 
		String msg= mapper.writeValueAsString(product);
		rabbitTemplate.convertAndSend(SIMPLE_QUEUE, msg);
	}

}
