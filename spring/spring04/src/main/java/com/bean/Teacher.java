package com.bean;

import org.springframework.stereotype.Component;

/**
 * @author zth
 * @Date 2019-06-22 22:06
 */
@Component
public class Teacher {
    private String name;
    private int age;

    public Teacher() {
        this.name = "王老师";
        this.age = 38;
    }

    public Teacher(String name, int age) {
        this.name = name;
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
