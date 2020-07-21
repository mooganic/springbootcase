package com.learn.springboot.web;

import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-21-下午7:21
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/update")
    @ResponseBody
    public Object update(Integer id, String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int count = studentService.updateStudentById(student);

        return "修改学生编号为" + id + "的姓名修改结果:" + count;

    }
}
