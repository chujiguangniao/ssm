package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(boolean com.itheima.service.ResourceService.openUrl(..))")
    private void servicePt() {}


    @Around("servicePt()")
    public Object trimUrl(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if(args[i] instanceof String){
                args[i]= args[i].toString().trim();
            }
        }

        Object proceed = pjp.proceed(args);
        return proceed;
    }
}
