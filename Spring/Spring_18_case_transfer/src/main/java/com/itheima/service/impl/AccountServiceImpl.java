package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;


    @Override
    public void transfer(String out, String in, Double money) {
        logService.log(out,in,money);
        accountDao.outMoney(out,money);
        int i =1/0;
        accountDao.inMoney(in,money);


    }
}
