package com.fzg.controller;

import com.fzg.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(@RequestParam("num") Integer id,@RequestParam("str") String name){
        System.out.println("接收到了请求,参数是：id="+ id + ", name=" + name);
        // 返回逻辑视图
        return "index";
    }
    @RequestMapping("/restful/{id}/{name}")
    public String restful(@PathVariable("id") Integer id,@PathVariable("name") String name){
        System.out.println(id + "-" + name);
        return "index";
    }

    @RequestMapping("/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String sessionId){
        System.out.println("sessionId======" + sessionId);
        return "index";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        System.out.println(user);
        return "index";
    }
}
