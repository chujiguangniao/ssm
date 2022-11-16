package com.cjgn;

import com.cjgn.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04TestApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void saveTest() {
        bookService.save();
    }

}
