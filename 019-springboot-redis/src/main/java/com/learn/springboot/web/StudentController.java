package com.learn.springboot.web;

import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wuminggao
 * @create 2020-07-21-下午10:13
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PutMapping("/put")
    public Object put(String key, String value){

        studentService.put(key, value);

        return "值已经放入redis";
    }

    @GetMapping("/get")
    public Object get(String key){

        String s = studentService.get(key);

        return s;
    }
}
