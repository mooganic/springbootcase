package com.learn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.learn.springboot.mapper")//开启扫描mapper接口的包和子包
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
