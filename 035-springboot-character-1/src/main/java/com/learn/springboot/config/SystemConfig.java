package com.learn.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

/**
 * @author wuminggao
 * @create 2020-07-22-下午4:35
 */
@Configuration
public class SystemConfig {

    @Bean
    public FilterRegistrationBean getCharacterEncodingFilter(){
        CharacterEncodingFilter characterEncodingFilter
                = new CharacterEncodingFilter("utf-8", true, true);

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(characterEncodingFilter);
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
