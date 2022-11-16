package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class AppForContainer {
    public static void main(String[] args) {
        //加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //文件形式进行加载
       // ApplicationContext ctx2 = new FileSystemXmlApplicationContext("E:\\Java-Demo\\Spring\\Spring_08_container\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
