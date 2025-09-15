package com.example.sm_marca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SmMarcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmMarcaApplication.class, args);
	}

}
