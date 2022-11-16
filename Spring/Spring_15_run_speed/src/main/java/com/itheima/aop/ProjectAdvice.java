package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void servicePt(){}

    @Around("servicePt()")
    public void runspeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String name = signature.getName();
        String declaringTypeName = signature.getDeclaringTypeName();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行"+declaringTypeName+"."+name+"的时间为:"+(end-start)+"ms");
    }
}
