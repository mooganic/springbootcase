package com.learn.springboot.web;

import com.learn.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wuminggao
 * @create 2020-07-22-下午3:17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户登录请求
     * @param request
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        User user = new User();
        user.setId(1);
        user.setUserName("zhangsan");
        request.getSession().setAttribute("user", user);

        return "login success";

    }

    /**
     * 登录后才可以访问
     * @return
     */
    @RequestMapping("/center")
    @ResponseBody
    public String center(){

        return "see center message";
    }

    /**
     * 不登录也可以访问的请求
     * @return
     */
    @RequestMapping("/out")
    @ResponseBody
    public String out(){

        return "see out message";
    }

    /**
     * 如果用户没登录访问了需要登录的页面，跳转到该请求
     * @return
     */
    @RequestMapping("/error")
    @ResponseBody
    public String error(){

        return "error! you need login";
    }
}
