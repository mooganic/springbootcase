package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-20-下午11:21
 */
@Controller
public class IndexController {

    @RequestMapping("/say")
    @ResponseBody
    public Object say(String message){
        return "say:hello, " + message;
    }
}
