package com.itheima.dao.Impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save2...");
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
