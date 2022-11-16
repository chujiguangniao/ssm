package com.cjgn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjgn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from tb_user ")
//    List<User> selectList();
}
