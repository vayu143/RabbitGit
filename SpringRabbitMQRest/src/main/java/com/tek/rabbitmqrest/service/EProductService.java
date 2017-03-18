package com.tek.rabbitmqrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.rabbitmqrest.model.EProduct;
import com.tek.rabbitmqrest.repository.EProductRepository;

@Service
public class EProductService {
	
	@Autowired
	EProductRepository eProductRepository;
	
	public void saveProduct(EProduct eProduct) {
		eProductRepository.save(eProduct);
	}
	

}
