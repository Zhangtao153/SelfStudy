package com.car.bean;

/**
 * @author zth
 * @Date 2019-06-05 16:20
 */
public class Customer {

    private int id;
    private int age;
    private String sex;
    private int shouru;
    private int family;
    private String local;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getShouru() {
        return shouru;
    }

    public void setShouru(int shouru) {
        this.shouru = shouru;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", shouru=" + shouru +
                ", family=" + family +
                ", local='" + local + '\'' +
                '}';
    }
}
