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
    public Result add(@RequestBody Book book) {
        boolean flag = bookService.add(book);
        return new Result(flag ? Code.Add_OK : Code.Add_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.Update_OK : Code.Update_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.Update_OK : Code.Update_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
//        int i = 1/0;
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.Get_OK : Code.Get_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试";
        return new Result(code, book, msg);
    }


    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books.isEmpty() ? Code.Get_ERR : Code.Get_OK;
        String msg = books.isEmpty() ? "数据查询失败，请重试" : "";
        return new Result(code,books,msg);
    }

}
