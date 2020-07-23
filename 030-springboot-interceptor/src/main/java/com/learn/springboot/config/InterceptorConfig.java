package com.learn.springboot.config;

import com.learn.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @author wuminggao
 * @create 2020-07-22-下午3:14
 */
@Configuration//定义此类为配置类
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(
                new UserInterceptor())
                .addPathPatterns("/user/**")//拦截user下的所有访问请求
                .excludePathPatterns(Arrays.asList("/user/out", "/user/error", "/user/login"));//排除掉的路径，不登录也可以访问


    }
}
