package com.bean;

import java.util.*;

/**
 * @author zth
 * @Date 2019-06-22 19:43
 */
public class Teacher {
    private String name;
    private int age;
    private Properties info;
    private Set<String> hobby = new HashSet<String>();
    private List<Student> stus = new ArrayList<Student>();
    private Map<String, String> clazz = new HashMap<String, String>();

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

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public Set<String> getHobby() {
        return hobby;
    }

    public void setHobby(Set<String> hobby) {
        this.hobby = hobby;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public Map<String, String> getClazz() {
        return clazz;
    }

    public void setClazz(Map<String, String> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info=" + info +
                ", hobby=" + hobby +
                ", stus=" + stus +
                ", clazz=" + clazz +
                '}';
    }
}
