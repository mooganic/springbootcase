package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * @author wuminggao
 * @create 2020-07-22-下午5:44
 */
@Controller
public class UserController {

    @RequestMapping("/user/detail")
    @ResponseBody
    public Object userDetail(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1001);
        map.put("username", "zhangsan");

        return map;
    }

    @RequestMapping("/user/page/detail")
    public ModelAndView userPage(ModelAndView modelAndView){
        modelAndView.addObject("id", 1001);
        modelAndView.addObject("username", "ssw");
        modelAndView.setViewName("userPage");
        return modelAndView;
    }



}
