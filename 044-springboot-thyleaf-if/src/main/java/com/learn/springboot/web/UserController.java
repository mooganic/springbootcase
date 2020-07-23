package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuminggao
 * @create 2020-07-23-下午4:24
 */
@Controller
public class UserController {

    @RequestMapping("/condition")
    public String condition(Model model){
        model.addAttribute("sex", 1);
        model.addAttribute("flag", true);
        model.addAttribute("productType", 2);
        return "condition";

    }
}
