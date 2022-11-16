package com.cjgn;

import com.cjgn.mapper.BookMapper;
import com.cjgn.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06SpringApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        Book byId = bookMapper.getById(2);
        System.out.println(byId);
    }

}
