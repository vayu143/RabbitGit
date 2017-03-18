package com.tek.rabbitmqrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class SpringRabbitMqRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqRestApplication.class, args);
	}
}
