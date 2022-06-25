package com.fzg.controller;

import com.fzg.entity.User;
import com.fzg.entity.UserList;
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
        return "redirect:/index.jsp";
    }

    @RequestMapping("/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String sessionId){
        System.out.println("sessionId======" + sessionId);
        return "index";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(User user){
        System.out.println(user);
//        return "index";
        return user.toString();
    }

    @RequestMapping("/arrayType")
    @ResponseBody
    public String ArrayType(String[] names){
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : names) {
            stringBuffer.append(s).append(" ");
        }
        return "names:" + stringBuffer.toString();
    }
    @RequestMapping("/listType")
    @ResponseBody
    public String ListType(UserList userList){
        StringBuffer stringBuffer = new StringBuffer();
        for(User user:userList.getUsers()){
            stringBuffer.append(user).append(" ");
        }
        return "UserList:" + stringBuffer.toString();
    }
    @RequestMapping("/jsonType")
    @ResponseBody
    public User jsonType(@RequestBody User user){
        System.out.println(user);
        user.setId(2);
        return user;
    }
    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id){
        return "id:"+id;
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value="id", required = true,defaultValue = "0") Integer id){
        return "id:" + id;
    }
}
