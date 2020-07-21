package com.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot项目启动入口
 */
@SpringBootApplication //SpringBoot核心注解，主要用于开启spring自动配置的注解
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
