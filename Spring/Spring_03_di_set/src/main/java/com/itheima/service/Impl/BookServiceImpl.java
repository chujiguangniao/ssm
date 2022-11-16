package com.itheima.service.Impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
        bookDao.save();
        System.out.println("book service save...");
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


}
