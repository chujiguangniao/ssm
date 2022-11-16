package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    //    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
//    @Pointcut("execution(* com.itheima.dao.Impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.*.*.*.*.update())") yes
//    @Pointcut("execution(* com.*.*.*.update())") yes
//    @Pointcut("execution(* *..update())")  yes
    //u开头的方法
//    @Pointcut("execution(* *..u*())") yes
    //e结尾的方法
//    @Pointcut("execution(* *..*e())") yes
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2() {
    }



    public void before() {
        System.out.println("before advice...");
    }


    public void after(){
        System.out.println("after advice...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        //表示对原始方法的调用
        Object proceed = pjp.proceed();
        System.out.println("around after advice...");
        return proceed;
    }

    @Around("pt2()")
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
