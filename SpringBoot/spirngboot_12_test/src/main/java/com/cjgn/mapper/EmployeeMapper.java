package com.cjgn.mapper;


import com.cjgn.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {


    @Select("select * from employee where e_id = #{id}")
    @Results(id = "idMap",value = {
            @Result(column = "e_id",property = "id"),
            @Result(column = "e_name",property = "name"),
            @Result(column = "d_id",property = "id2")
    })
    public Employee getById(Integer id);
}
