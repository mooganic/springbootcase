package com.learn.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//开启Spring配置
@EnableDubboConfiguration//开启dubbo配置
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
