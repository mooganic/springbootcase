package com.learn.springboot.service.impl;

import com.learn.springboot.mapper.StudentMapper;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuminggao
 * @create 2020-07-21-下午5:49
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
