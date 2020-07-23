package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-22-下午10:40
 */
@Controller
public class UserController {

    @RequestMapping("/index")
    public ModelAndView message(ModelAndView modelAndView){
        modelAndView.addObject("msg", "SpringBoot 集成 thymeleaf模板引擎");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
