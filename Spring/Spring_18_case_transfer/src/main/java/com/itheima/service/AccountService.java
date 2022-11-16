package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    //转账

    /**
     *
     * @param out 转出
     * @param in 转入
     * @param money 转账金额
     */
    @Transactional(rollbackFor = {IOException.class})
    void transfer(String out,String in,Double money);
}
