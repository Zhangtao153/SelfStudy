package com.zth.asp;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class MyArround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前置。。。");
        Object result = invocation.proceed();
        System.out.println("环绕后置。。。");
        return result;
    }
}
