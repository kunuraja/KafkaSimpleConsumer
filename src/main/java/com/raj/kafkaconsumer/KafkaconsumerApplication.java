package com.raj.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconsumerApplication.class, args);
		System.out.println("My first kafka consumer with git");
	}

}
