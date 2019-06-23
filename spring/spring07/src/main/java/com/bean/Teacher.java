package com.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zth
 * @Date 2019-06-22 22:06
 */

public class Teacher {
    private String name;
    private int age;

    public Teacher() {
        this.name = "老刘";
        this.age = 38;
        System.out.println("构造方法。。。。。");
    }

    @PostConstruct
    public void init(){
        System.out.println("init........");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("init........");
    }

    /*getter setter */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
