package com.learn.springboot.service.impl;
import com.learn.springboot.mapper.StudentMapper;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuminggao
 * @create 2020-07-22-下午9:16
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentCount() {
        Integer count = studentMapper.selectStudentCount();
        return count;
    }
}
