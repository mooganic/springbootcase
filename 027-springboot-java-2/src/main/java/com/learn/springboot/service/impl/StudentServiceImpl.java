package com.learn.springboot.service.impl;

import com.learn.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author wuminggao
 * @create 2020-07-22-下午12:47
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String msg) {
        return "say:" + msg;
    }
}
