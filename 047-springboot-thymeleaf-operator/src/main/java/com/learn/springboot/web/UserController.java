package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuminggao
 * @create 2020-07-23-下午5:45
 */
@Controller
public class UserController {

    @RequestMapping("/operator")
    public String operator(Model model){

        model.addAttribute("sex", 1);
        model.addAttribute("flag", true);

        return "operator" ;
    }
}
