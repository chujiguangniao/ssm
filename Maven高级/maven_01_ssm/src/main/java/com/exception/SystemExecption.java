package com.exception;

public class SystemExecption extends RuntimeException{
    //异常编号
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemExecption(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemExecption(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
