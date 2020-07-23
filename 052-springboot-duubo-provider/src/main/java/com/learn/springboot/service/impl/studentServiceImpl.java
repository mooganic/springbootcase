package com.learn.springboot.service.impl;

import com.learn.springboot.mapper.StudentMapper;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuminggao
 * @create 2020-07-23-下午10:50
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
        (interfaceClass = studentService.class, version = "1.0.0", timeout = 15000)
public class studentServiceImpl implements studentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
