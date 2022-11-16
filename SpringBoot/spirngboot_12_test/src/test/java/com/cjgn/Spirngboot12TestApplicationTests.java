package com.cjgn;

import com.cjgn.mapper.EmployeeMapper;
import com.cjgn.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Spirngboot12TestApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;



    @Test
    void contextLoads() {
        Employee byId = employeeMapper.getById(1);
        System.out.println(byId);
    }

}
