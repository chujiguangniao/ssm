package com.controller;


import com.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/toJumpPage")
    //响应跳转页面
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }


    //响应字符串
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    //响应json数据
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回json对象");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    //响应pojo集合对象
    public List<User> toJsonList(){
        System.out.println("返回json集合");
        User user1 = new User();
        user1.setName("传智播客");
        user1.setAge(12);

        User user2 = new User();
        user2.setName("黑马程序员");
        user2.setAge(12);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        System.out.println(userList);
        return userList;


    }

}
