package com.itheima.service;


import com.itheima.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Autowired
    private Date date;


    @Test
    public void testTransfer(){
        accountService.transfer("Tom","Jerry",100D);
    }

    @Test
    public void testTime(){
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为: " + ft.format(date));
        System.out.println(date.toString());
    }

    @Test
    public void testArray(){
        Integer[] a = {1,2,3};
        System.out.println(a.length);
    }
}
