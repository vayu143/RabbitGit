package com.tek.rabbitmqrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tek.rabbitmqrest.model.EProduct;
import com.tek.rabbitmqrest.service.EProductService;

@RestController
public class EProductController {
	
	@Autowired
	EProductService service;
	
	@RequestMapping(value="/receive", method=RequestMethod.POST)
	public void saveEProduct(@RequestBody EProduct eProduct) {
	
		System.out.println(eProduct);
		service.saveProduct(eProduct);
		
	}

}
