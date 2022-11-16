package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountDao {

    @Insert("insert into tbl_account (name, money) values (#{name},#{money})")
    void save(Account account);

    @Delete("delete from tbl_account where id = #{id}")
    void delect(int id);

    @Update("update tbl_account set name = #{name},money = #{money}")
    void update(Account account);

    @Select("select * from tbl_account")
    List<Account> findAll();

    @Select("select * from tbl_account where id = #{id}")
    Account findById(int id);


}
