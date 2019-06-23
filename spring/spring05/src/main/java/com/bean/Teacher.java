package com.bean;

import java.util.Properties;

/**
 * @author zth
 * @Date 2019-06-22 19:43
 */
public class Teacher {
    private String name;
    private int age;


    public Teacher() {
        this.name = "张老师";
        this.age = 34;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;


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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
