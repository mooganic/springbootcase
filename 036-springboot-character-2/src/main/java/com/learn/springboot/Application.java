package com.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.learn.springboot.servlet")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
