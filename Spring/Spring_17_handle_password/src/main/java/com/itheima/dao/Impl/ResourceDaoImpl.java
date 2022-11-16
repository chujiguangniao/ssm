package com.itheima.dao.Impl;

import com.itheima.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResource(String url, String password) {
        //模拟校验
        return password.equals("root");
    }
}
