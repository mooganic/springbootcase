package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * @author wuminggao
 * @create 2020-07-22-下午7:42
 */
@Controller
public class UserController {

    @RequestMapping("/user/json/detail")
    public @ResponseBody Object userJsonDetail(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1001);
        map.put("username", "wangwu");

        return map;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPageDetail(Model model){
        model.addAttribute("id", 1002);
        model.addAttribute("username", "lisi");

        return "userDetail";


    }

}
