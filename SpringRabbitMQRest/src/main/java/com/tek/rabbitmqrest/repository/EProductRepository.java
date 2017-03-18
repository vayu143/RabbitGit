package com.tek.rabbitmqrest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Component;

import com.tek.rabbitmqrest.model.EProduct;

@Component
public interface EProductRepository extends MongoRepository<EProduct, String> {

}
