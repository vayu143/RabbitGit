package com.rabbitmq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rabbitmq.beans.Product;
import com.rabbitmq.service.MessageConvertingNSendingService;

@RestController
public class ProductController {

	@Autowired
	MessageConvertingNSendingService mcs;

	@RequestMapping(value = "/sendproduct", method = RequestMethod.POST)
	public void processMessage(@RequestBody Product product) throws JsonProcessingException {
		mcs.convertMessageNSend(product);

	}

}
