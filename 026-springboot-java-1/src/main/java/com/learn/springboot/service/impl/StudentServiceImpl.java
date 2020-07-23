package com.learn.springboot.service.impl;

import com.learn.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author wuminggao
 * @create 2020-07-22-下午12:21
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "Hello SpringBoot";
    }
}
