package com.rabbitmq.service;

import java.io.IOException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.beans.Product;

@Component
public class ListenerService {

	@Autowired
	private RestTemplate restTemplate;

	@RabbitListener(queues = "tekgroupproducts")
	public void listener(Message m) throws JsonParseException, JsonMappingException, IOException {
		System.out.println("message is" + m);
		byte[] a = m.getBody();
		Product product = new ObjectMapper().readValue(new String(a), Product.class);
		
		try {
			String url = "http://localhost:8081/receive";
			restTemplate.postForLocation(url, product);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
