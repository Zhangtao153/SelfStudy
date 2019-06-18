package com.pojo;

public class Stu {
	private int id;
	private int clazzId;
	private String name;
	private String sex;
	private int age;
	
    private Score score;
	private Clazz clazz;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClazzId() {
		return clazzId;
	}

	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Stu{" +
				"id=" + id +
				", clazzId=" + clazzId +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				", score=" + score +
				", clazz=" + clazz +
				'}';
	}
}
