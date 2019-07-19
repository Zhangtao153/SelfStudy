package com.zth.asp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

/**
 * @author zth
 * @Date 2019-07-19 2:40
 */
@Aspect
@Component
public class Logger {
    @Before("execution(* com.zth.service.imp.*.*(..))")
    public void before() {
        System.out.println("before...");
    }

    public void after() {
        System.out.println("after....");
    }

}
