package com.learn.springboot.service;

import com.learn.springboot.model.Student;

/**
 * @author wuminggao
 * @create 2020-07-22-上午10:38
 */
public interface StudentService {
    Student queryStudentById(Integer id);

    Integer queryStudentCount();

}
