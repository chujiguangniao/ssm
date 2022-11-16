package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {
        //获取连接
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //连接bean，获取类的实例化对象
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        //调用方法
        userDao.save();
    }
}
