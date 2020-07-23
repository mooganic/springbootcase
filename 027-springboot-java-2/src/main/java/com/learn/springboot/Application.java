package com.learn.springboot;

import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	//重写CommandLineRunner的run方法
	@Override
	public void run(String... args) throws Exception {
		String s = studentService.sayHello(" World");
		System.out.println(s);
	}
}
