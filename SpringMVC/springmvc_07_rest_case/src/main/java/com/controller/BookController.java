package com.controller;


import com.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    //保存
    public String save(@RequestBody Book book){
        System.out.println("book save ==>"+book);
        return "{'module':'book save success'}";
    }


    @GetMapping
    //查询全部
    public List<Book> getAll(){
        System.out.println("book getAll is running...");
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门教程");
        book1.setDescription("小试牛刀");
        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实战教程");
        book2.setDescription("一代宗师");

        bookList.add(book1);
        bookList.add(book2);
        return bookList;
    }

}
