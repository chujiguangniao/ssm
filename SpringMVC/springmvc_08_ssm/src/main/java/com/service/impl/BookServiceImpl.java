package com.service.impl;

import com.mapper.BookMapper;
import com.pojo.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean add(Book book) {
        bookMapper.add(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookMapper.delete(id);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookMapper.update(book);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookMapper.getById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookMapper.getAll();
        return books;
    }
}
