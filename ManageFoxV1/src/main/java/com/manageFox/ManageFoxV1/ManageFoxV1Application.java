package com.manageFox.ManageFoxV1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ManageFoxV1Application {

	public static void main(String[] args) {
		SpringApplication.run(ManageFoxV1Application.class, args);
	}

}
