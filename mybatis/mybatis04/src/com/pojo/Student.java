package com.pojo;

import java.util.Date;

public class Student {
	//private int studId;
	private int stud_id;
	private String name;
	private String email;
	private Date dob;

    public Student(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student() {
    }

    public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stud_id=" + stud_id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", dob=" + dob +
				'}';
	}
}
