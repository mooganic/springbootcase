package com.learn.springboot.config;

import com.learn.springboot.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author wuminggao
 * @create 2020-07-22-下午4:18
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean
                = new FilterRegistrationBean<>(new MyFilter());
        filterFilterRegistrationBean.addUrlPatterns("/user/*");

        return filterFilterRegistrationBean;
    }
}
