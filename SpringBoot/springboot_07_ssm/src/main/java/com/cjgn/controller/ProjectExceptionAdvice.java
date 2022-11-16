package com.cjgn.controller;



import com.cjgn.exception.BusinessException;
import com.cjgn.exception.SystemExecption;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler({SystemExecption.class})
    public Result doSystemException(SystemExecption ex){
        //发送信息给用户安慰用户
        //联系运维人员进行修改
        //发送日志
        return new Result(ex.getCode(),null,ex.getMessage());
    }


    @ExceptionHandler({BusinessException.class})
    public Result doSystemException(BusinessException ex){
        //只需告诉用户你要规范使用
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler({Exception.class})
    public Result doException(Exception ex){
        //发送信息给用户安慰用户
        //联系运维人员进行修改
        //发送日志
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后");
    }
}
