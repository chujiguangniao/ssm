package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    //属性注入
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;


    //1、定义一个方法获取要管理的对象

    //将返回值定义为一个bean
    @Bean("dataSourse")
    public DataSource getdataSource(BookDao bookDao2){
        bookDao2.save();
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
