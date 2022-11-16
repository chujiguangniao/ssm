package com.itheima.dao.Impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {


    @Override
    public String findName(int id,String name) {
        System.out.println("id:"+id);
        return "idcast";
    }
}
