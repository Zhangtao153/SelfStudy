package com.zth.asp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.zth.service.*.*(..))")
    private void anyPublicOperation() {}

    @Before("anyPublicOperation()")
    public void before() {
        System.out.println("before...");
    }
    @After("anyPublicOperation()")
    public void after() {
        System.out.println("after....");
    }
    @AfterThrowing("anyPublicOperation()")
    public void exception(){
        System.out.println("出错了。。。");
    }

    @Around("anyPublicOperation()" )
    public Object myArround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前置。。。");
        Object result = joinPoint.proceed();
        System.out.println("环绕后置。。。");
        return result;
    }

}
