package com.learn.springboot.web;

import com.learn.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

/**
 * @author wuminggao
 * @create 2020-07-22-下午9:17
 */
@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/student/count")
    public String studentCount(){


        Integer count = studentService.queryStudentCount();
        return "学生人数：" + count;
    }
}
