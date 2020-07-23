package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wuminggao
 * @create 2020-07-23-下午6:13
 */
@Controller
public class UserController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model){
        model.addAttribute("username", "lisi");
        request.getSession().setAttribute("data", "session data");
        return "index";
    }
}
