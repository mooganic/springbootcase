package com.learn.springboot.config;

import com.learn.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

/**
 * @author wuminggao
 * @create 2020-07-22-下午3:49
 */
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<MyServlet> myServletRegistrationBean(){
        ServletRegistrationBean<MyServlet> myServletServletRegistrationBean
                = new ServletRegistrationBean<>(new MyServlet(), "/myservlet");

        return myServletServletRegistrationBean;
    }
}
