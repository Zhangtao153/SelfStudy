package com.zth.asp;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zth
 * @Date 2019-07-19 10:26
 */
@Component
public class AfterAdvice implements AfterReturningAdvice {

    /**
     *
     * @param returnValue 切点方法返回值
     * @param method 切点方法对象
     * @param args 切点方法参数
     * @param target 切点方法所在的类对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("发送邮件后。。。");
    }
}
