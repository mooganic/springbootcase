package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-20-下午10:42
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/springboot/say")
    @ResponseBody
    public String say(ModelAndView modelAndView){
        System.out.println(modelAndView);
        return "Hello spring Boot";
    }
}
