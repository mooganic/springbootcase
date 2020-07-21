package com.learn.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.learn.springboot.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author wuminggao
 * @create 2020-07-21-下午11:25
 */
@org.springframework.stereotype.Service
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryStudentCount() {
        int count = 123;
        return count;
    }
}
