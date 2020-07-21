package com.learn.springboot.web;

import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-21-下午4:18
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/student")
    @ResponseBody
    public Object student(Integer id){
        System.out.println("Controller************");
        Student student = studentService.queryStudentById(id);
        return student;
    }
}
