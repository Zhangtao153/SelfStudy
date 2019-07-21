package com.zth.bean;

/**
 * @author zth
 * @Date 2019-07-21 19:31
 */
public class Student {
    int tud_id;
    String name;
    String email;
    String dob;

    public int getTud_id() {
        return tud_id;
    }

    public void setTud_id(int tud_id) {
        this.tud_id = tud_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "tud_id=" + tud_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
