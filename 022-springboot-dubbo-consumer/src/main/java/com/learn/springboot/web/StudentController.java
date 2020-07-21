package com.learn.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuminggao
 * @create 2020-07-21-下午11:22
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = true)
    private StudentService studentService;


    @RequestMapping("/student")
    @ResponseBody
    public Object studentCount(){
        Integer count = studentService.queryStudentCount();
        return "学生人数为：" + count;
    }
}
