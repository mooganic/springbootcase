package com.learn.springboot;

import com.learn.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/**
		 * SpringBoot程序启动后，返回值是ConfigurableApplicationContext,它也是一个Spring容器
		 * 相当于原来Spring容器中启动ClasspathXmlApplicationContext;
		 */

		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		StudentService studentServiceImpl = run.getBean("studentServiceImpl", StudentService.class);
		String s = studentServiceImpl.sayHello();
		System.out.println(s);


	}

}
