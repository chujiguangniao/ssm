package com.itheima.service.Impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("bookService")
public class BookServiceImpl implements BookService{
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save...");
    }




}
