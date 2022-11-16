package com.service;

import com.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 增加
     * @param book
     * @return
     */
    public boolean add(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按照id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);


    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
