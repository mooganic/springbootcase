package com.learn.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-20-下午11:40
 */
@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${website}")
    private String website;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        System.out.println("schoolName:" + schoolName + ",website");
        return "Hello SpringBoot multi-environment" + website;
    }
}
