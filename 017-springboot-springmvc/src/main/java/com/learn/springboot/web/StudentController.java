package com.learn.springboot.web;

import com.learn.springboot.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author wuminggao
 * @create 2020-07-21-下午8:40
 */
@RestController
public class StudentController {

    @RequestMapping("/student")
    public Object student(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        student.setAge(18);

        return student;
    }

    /**
     * 该方法请求方式支持get和post请求
     * @param id
     * @return
     */
    @RequestMapping(value = "/studentDetail", method = {RequestMethod.GET, RequestMethod.POST})
    public Object queryStudenById(Integer id){
        Student student = new Student();
        student.setId(1002);
        student.setName("zhangsan");
        student.setAge(18);

        return student;
    }

//    @RequestMapping(value = "/queryStudenById", method = RequestMethod.GET)
    @GetMapping("/queryStudenById")
    public Object queryStudenById2(Integer id){
        Student student = new Student();
        student.setId(1002);
        student.setName("getMethod");
        student.setAge(18);
        return student;
    }

    @DeleteMapping("/delete")
    public Object delete(){
        return "delete a student";
    }
}
