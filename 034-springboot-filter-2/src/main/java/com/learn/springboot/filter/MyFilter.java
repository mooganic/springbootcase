package com.learn.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wuminggao
 * @create 2020-07-22-下午4:17
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("********filter2********");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
