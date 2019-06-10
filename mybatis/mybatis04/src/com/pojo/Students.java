package com.pojo;

import java.util.Date;

public class Students {

  private int	studId;
  private String	name;
  private String	email;
  private Date dob;
  private String phone;


    public Students(int studId, String name, String email, Date dob, String phone) {
        this.studId = studId;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
    }

    public Students(){

    }

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
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
		return "Students{" +
				"studId=" + studId +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", dob=" + dob +
				", phone='" + phone + '\'' +
				'}';
	}
}
