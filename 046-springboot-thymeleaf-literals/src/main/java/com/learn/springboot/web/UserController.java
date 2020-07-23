package com.learn.springboot.web;

import com.learn.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuminggao
 * @create 2020-07-23-下午4:54
 */
@Controller
public class UserController {

    @RequestMapping("/literal")
    public String literal(Model model){
        model.addAttribute("sex", 1);
        model.addAttribute("data", "springboot literal");
        model.addAttribute("flag", true);
        User user = new User();
        user.setId(1001);
        user.setName("张三");
        model.addAttribute("user", user);

        model.addAttribute("user2", new User());

        return "literal";
    }

    @RequestMapping("/splice")
    public String splice(Model model){
        model.addAttribute("totalRows", 123);
        model.addAttribute("totalPage", 13);
        model.addAttribute("currentPage", 3);

        return "splice";
    }


}
