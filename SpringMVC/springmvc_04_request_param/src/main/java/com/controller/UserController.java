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
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //普通参数
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age) {
        System.out.println("普通参数传递 name==>" + name);
        System.out.println("普通参数传递 age==>" + age);
        return "{'module':'common param'}";
    }


    //演示形参和传递名字不同的普通参数
    @RequestMapping("/differentCommonParam")
    @ResponseBody
    public String differentCommonParam(@RequestParam("name") String userName, int age) {
        System.out.println("普通参数传递 userName==>" + userName);
        System.out.println("普通参数传递 age==>" + age);
        return "{'module':'common param'}";
    }


    //演示POJO参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 user==>" + user);
        return "{'module':'pojo param'}";
    }


    //演示引类型参数参数
    @RequestMapping("/containPojoParam")
    @ResponseBody
    public String containPojoParam(User user) {
        System.out.println("pojo嵌套pojo参数传递 user==>" + user);
        return "{'module':'pojo contain param'}";
    }


    @RequestMapping("/arrayParam")
    @ResponseBody
    //演示数组类型参数
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递 like==>" + Arrays.toString(likes));
        return "{'module':'array param'}";
    }



    @RequestMapping("/listParam")
    @ResponseBody
    //演示集合参数
    public String listParam(@RequestParam("likes") List<String> likes){
        System.out.println("集合参数传递 like==>"+likes);
        return "{'module':'list param'}";
    }


    @RequestMapping("/listParamJson")
    @ResponseBody
    //演示集合参数json
    public String listParamJson(@RequestBody List<String> likes){
        System.out.println("list common(json)参数传递 ==>"+likes);
        return "{'module':'list common for json param'}";
    }


    @RequestMapping("/pojoParamJson")
    @ResponseBody
    //演示pojo参数json格式
    public String pojoParanJson(@RequestBody User user){
        System.out.println("pojo(json)参数传递 ==>"+user);
        return "{'module':'pojo form json param'}";
    }


    @RequestMapping("/listPojoParamJson")
    @ResponseBody
    //演示pojo集合json格式
    public String listPojoParamJson(@RequestBody List<User> list){
        System.out.println("list pojo(json)参数传递 ==>"+list);
        return "{'module':'list pojo json param'}";
    }


    @RequestMapping("/dataParam")
    @ResponseBody
    //演示日期参数
    public String dataParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("参数传递 ==>"+date);
        System.out.println("参数传递 ==>"+date1);
        System.out.println("参数传递 ==>"+date2);
        return "{'module':'data param'}";
    }

}
