package com.cjgn;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cjgn.mapper.UserMapper;
import com.cjgn.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //新增测试
    @Test
    public void testAdd(){
        User user = new User();
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userMapper.insert(user);
    }



    //查询测试
    @Test
    public void testGetAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }


    //删除
    @Test
    public void testDelete(){
        int i = userMapper.deleteById(1590314060010852353l);
        System.out.println(i);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1l);
        user.setName("Tom888");
        user.setPassword("tom888");
        userMapper.updateById(user);
    }

    @Test
    public void testGetById(){
        User user = userMapper.selectById(1l);
        System.out.println(user);
    }

    @Test
    public void testGetByPage(){
        IPage page = new Page(1,2);
        userMapper.selectPage(page,null);
        System.out.println("当前页码值:"+page.getCurrent());
        System.out.println("每页显示数:"+page.getSize());
        System.out.println("一共多少页:"+page.getPages());
        System.out.println("一共多少条:"+page.getTotal());
        System.out.println("数据:"+page.getRecords());
    }

}
