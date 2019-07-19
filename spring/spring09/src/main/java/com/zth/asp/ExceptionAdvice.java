package com.zth.asp;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zth
 * @Date 2019-07-19 11:41
 */
@Component
public class ExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
        System.out.println("执行异常通知");
    }
   /* public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("执行异常通过-schema-base 方式");
    }*/
}
