package com.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zth
 * @Date 2019-06-22 19:44
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "张三";
        this.age = 18;
    }

    /*getter setter toString*/

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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
