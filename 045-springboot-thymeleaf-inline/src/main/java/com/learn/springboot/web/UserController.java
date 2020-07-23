package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuminggao
 * @create 2020-07-23-下午4:45
 */
@Controller
public class UserController {

    @RequestMapping("/inline")
    public String inline(Model model){
        model.addAttribute("data", "SpringBoot inline");

        return "inline-test";
    }
}
