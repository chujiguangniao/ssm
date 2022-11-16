package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(String com.itheima.dao.BookDao.findName(..))")
    private void pt() {
    }

    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice...");
    }

   // @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        System.out.println("around before advice...");
        //表示对原始方法的调用
        Object proceed = pjp.proceed(args);
        System.out.println("around after advice...");
        return proceed;
    }


    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        //表示对原始方法的调用
        Integer proceed = (Integer) pjp.proceed();
        System.out.println("around after advice...");
        //返回值
        return proceed;
    }

    public void afterReturning(){
        System.out.println("afterReturning advice...");
    }

    public void afterThrowing(){
        System.out.println("afterThrowing advice...");
    }
}
