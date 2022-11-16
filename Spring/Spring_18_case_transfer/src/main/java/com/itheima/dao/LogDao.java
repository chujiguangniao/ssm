package com.itheima.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface LogDao {


    @Insert("insert into tbl_log (info, createDate) values (#{log},current_date);")
    void insertLog(String log);
}
