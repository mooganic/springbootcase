package com.learn.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuminggao
 * @create 2020-07-23-下午10:46
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = studentService.class, version = "1.0.0", check = false)
    private studentService studentService;


    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model, @PathVariable("id") Integer id){
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }
}
