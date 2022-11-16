package com.cjgn.mapper;


import com.cjgn.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


/*TODO 添加代理*/
@Mapper
public interface BookMapper {


    @Insert("insert into tbl_book(type, name, description) VALUES (#{type},#{name},#{description})")
    public int add(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Update("update tbl_book set type = #{type},name = #{name},description=#{description} where id=#{id}")
    public int update(Book book);


    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();



}
