package com.learn.springboot.service;

import com.learn.springboot.model.Student;

/**
 * @author wuminggao
 * @create 2020-07-21-下午4:20
 */
public interface StudentService {
    /**
     * 根据学生id查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
