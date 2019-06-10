package com.pojo;

import java.util.Date;

public class Students {

  private int stu_id;
  private String name;
  private String email;
  private Date dob;
  private int age;
  private SexEnum sex;

public Students() {
	super();
}



public Students(String name, String email, Date dob,  SexEnum sex) {
	super();
	this.name = name;
	this.email = email;
	this.dob = dob;
	this.sex = sex;
}



public int getStu_id() {
	return stu_id;
}

public void setStu_id(int stu_id) {
	this.stu_id = stu_id;
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


public SexEnum getSex() {
	return sex;
}

public void setSex(SexEnum sex) {
	this.sex = sex;
}



@Override
public String toString() {
	return "Students [stu_id=" + stu_id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age
			+ ", sex=" + sex + "]";
}



	
}
