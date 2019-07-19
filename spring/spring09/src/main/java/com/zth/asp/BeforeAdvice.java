package com.zth.asp;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zth
 * @Date 2019-07-19 10:26
 */
@Component
public class BeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 切点方法对象 Method 对象
     * @param args 切点方法参数
     * @param target 切点在哪个对象中
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("发送前邮件。。。");
    }
}
