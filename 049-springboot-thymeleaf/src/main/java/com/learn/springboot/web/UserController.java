package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author wuminggao
 * @create 2020-07-23-下午7:46
 */
@Controller
public class UserController {

    @RequestMapping("/function")
    public String func(Model model){
        model.addAttribute("time", new Date());
        model.addAttribute("strings", "springboot");
        return "function";
    }
}
