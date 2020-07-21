package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-21-上午11:54
 */
@Controller
public class IndexController {

    @RequestMapping("/say")
    public ModelAndView say(ModelAndView modelAndView){
        modelAndView.addObject("msg", "Hello, SpringBoot");
        modelAndView.setViewName("say");
        return modelAndView;
    }
}
