package com.learn.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author wuminggao
 * @create 2020-07-22-下午4:07
 */
@WebFilter(urlPatterns = "/myfilter")
public class MyFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("this a filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }


}
