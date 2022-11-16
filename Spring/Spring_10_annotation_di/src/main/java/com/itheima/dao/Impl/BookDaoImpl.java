package com.itheima.dao.Impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save..."+name);
    }

    /*@PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory...");
    }*/

}
