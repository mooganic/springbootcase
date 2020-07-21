package com.learn.springboot.web;

import com.learn.springboot.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author wuminggao
 * @create 2020-07-21-下午9:25
 */
@RestController
public class StudentController {

    @RequestMapping("/student")
    public Student student(Integer id, Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);

        return student;

    }

    @GetMapping("/student/detail/{id}/{age}")
    public Student student2(@PathVariable("id") Integer id, @PathVariable("age") Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;

    }

    @DeleteMapping("/student/detail/{id}/{state}")
    public Object student3(@PathVariable("id") Integer id, @PathVariable("state") Integer state){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", id) ;
        hashMap.put("state", state);
        return hashMap;
    }
}
