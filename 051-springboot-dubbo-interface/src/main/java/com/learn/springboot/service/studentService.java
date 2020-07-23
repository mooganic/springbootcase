package com.learn.springboot.service;

import com.learn.springboot.model.Student;

/**
 * @author wuminggao
 * @create 2020-07-23-下午10:48
 */
public interface studentService {
    /**
     * 根据学生id查询信息
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 查询学生人数
     * @return 学生人数
     */
    Integer queryStudentCount();
}
