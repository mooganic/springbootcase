package com.learn.springboot.controller;

import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-21-下午5:44
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public Student queryStudentById(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }

}
