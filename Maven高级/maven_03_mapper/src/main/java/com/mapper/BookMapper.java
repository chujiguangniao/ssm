package com.mapper;

import com.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

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
