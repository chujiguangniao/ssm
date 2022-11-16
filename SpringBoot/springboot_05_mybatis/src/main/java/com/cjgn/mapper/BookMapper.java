package com.cjgn.mapper;

import com.cjgn.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {


    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

}
