package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    //设置当前操作的访问路径
    @RequestMapping("/save")
    //设置当前操作的返回值类型是response返回到网页
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'springmvc'}";
    }

    //设置当前操作的访问路径
    @RequestMapping("/delete")
    //设置当前操作的返回值类型是response返回到网页
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module':'springmvc delete'}";
    }
}
