package com.learn.springboot.web;

import com.learn.springboot.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-23-上午12:04
 */
@org.springframework.stereotype.Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail(ModelAndView modelAndView){
        User user = new User();
        user.setId(1001);
        user.setName("李四");
        user.setAge(18);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("userDetail");
        return modelAndView;
    }

    @RequestMapping(value = "/url")
    public String urlExpression(Model model){
        model.addAttribute("id", 1230);
        model.addAttribute("username", "zhaosi");
        model.addAttribute("age", 23);
        return "url";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(String username){

        return "请求路径/test,参数是" + username;
    }

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(String username, Integer id, Integer age){

        return "请求路径/test,参数username=" + username + ",age=" + age + ",id=" + id;
    }

    @RequestMapping(value = "/test2/{id}")
    @ResponseBody
    public String  test2(@PathVariable("id") Integer id){
        return "ID:" + id;
    }

    @RequestMapping(value = "/test3/{id}/{username}")
    @ResponseBody
    public String  test3(@PathVariable("id") Integer id,
                         @PathVariable(value = "username") String username){
        return "ID:" + id + ",username" + username;
    }

    @RequestMapping("/url2")
    public String url2(){
        return "/url2";
    }

    @RequestMapping(value = "/property")
    public String property(){
        return "property";
    }

}
