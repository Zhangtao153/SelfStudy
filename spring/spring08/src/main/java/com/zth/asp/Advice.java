package com.zth.asp;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zth
 * @Date 2019-07-19 15:50
 */
@Aspect
@Component
public class Advice {
    public void before(String msg) {
        System.out.println("before..."+msg);
    }
    public void before() {
        System.out.println("before...");
    }
}
