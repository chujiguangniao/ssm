package com.cjgn.service.impl;


import com.cjgn.controller.Code;
import com.cjgn.exception.BusinessException;
import com.cjgn.mapper.BookMapper;
import com.cjgn.pojo.Book;
import com.cjgn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean add(Book book) {
        return bookMapper.add(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.delete(id) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.update(book) > 0;
    }

    @Override
    public Book getById(Integer id) {
        if (id == 1) {
            throw new BusinessException(Code.BUINESS_ERROR, "请规范使用");
        }

    /*    //将可能出现的异常进行包装，转换成自定义异常
        try {
            int i = 1 / 0;
        }
        catch (Exception e) {
            throw new SystemExecption(Code.SYSTEM_TIMEOUT_ERROR, "服务器访问超时，请重试", e);
        }*/
        Book book = bookMapper.getById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookMapper.getAll();
        return books;
    }
}
