package com.learn.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-22-上午10:34
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false, timeout = 15000)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public ModelAndView studentDetail(@PathVariable("id") Integer id, ModelAndView modelAndView){
        Student student = studentService.queryStudentById(id);

        modelAndView.addObject("student", student);

        modelAndView.setViewName("studentDetail");
        return modelAndView;

    }

    @RequestMapping("/student/all/count")
    @ResponseBody
    public String studentCount(){
        int studentCount = studentService.queryStudentCount();

        return "students count:" + studentCount;

    }



}
