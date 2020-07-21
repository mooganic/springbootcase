package com.learn.springboot.service;

import com.learn.springboot.model.Student;

/**
 * @author wuminggao
 * @create 2020-07-21-下午5:48
 */
public interface StudentService {
    Student queryStudentById(Integer id);
}
