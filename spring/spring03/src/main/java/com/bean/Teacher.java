package com.bean;

import org.springframework.stereotype.Component;

/**
 * @author zth
 * @Date 2019-06-22 19:43
 */

@Component
public class Teacher {
    private String name;
    private int age;

    public Teacher(){
        this.name = "刘老师";
        this.age = 36;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
