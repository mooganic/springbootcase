package com.learn.springboot.web;

import com.learn.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-21-上午11:23
 */
@Controller
public class IndexController {

    @Autowired
    private School school;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        System.out.println("schoolName:" + school.getName() + ",website");
        return "Hello SpringBoot  " + ",school.name:" + school.getName() +
                ",school.website:" + school.getWebsite();
    }
}
