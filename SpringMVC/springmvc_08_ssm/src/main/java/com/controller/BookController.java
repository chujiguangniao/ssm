package com.controller;


import com.pojo.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean add(@RequestBody Book book) {
        return bookService.add(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return book;
    }


    @GetMapping
    public List<Book> getAll() {
        List<Book> books = bookService.getAll();
        return books;
    }

}
