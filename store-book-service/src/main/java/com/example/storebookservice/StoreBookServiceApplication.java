package com.example.storebookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class StoreBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreBookServiceApplication.class, args);
	}

}
