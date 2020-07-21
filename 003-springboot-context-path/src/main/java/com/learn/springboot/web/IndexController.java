package com.learn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuminggao
 * @create 2020-07-20-下午10:59
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "Hello say SpringBoot";
    }

    @RequestMapping(value = "/map")
    @ResponseBody
    public Map mapValue(){
        HashMap<String, Object> map= new HashMap<>();
        map.put("message", "SpringBoot project");
        map.put("username", "wuminggao");
        map.put("id", "123998888");
        return map;
    }
}
