package com.learn.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration//开启Dubbo配置
@MapperScan(basePackages = "com.learn.springboot.mapper")//扫描mapper接口
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
