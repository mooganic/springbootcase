package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuminggao
 * @create 2020-07-22-下午4:20
 */
@Controller
public class UserController {

    @RequestMapping("/user/detail")
    @ResponseBody
    public String userDetail(){
        return "this is user detail: ";
    }

    @RequestMapping("/other")
    @ResponseBody
    public String doOther(){
        return "this is other method ";
    }

}
