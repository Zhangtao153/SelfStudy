package com.mapper;

import java.util.List;
import java.util.Map;

import com.pojo.Student;


public interface StudentMapper {
	//查询所有学生
	public List<Student> findAllStudents();

	//据据id找学生
	public Student findStudentById(Integer id);
	
	//增加一个学生
	public void insertStudent(Student student);
	
	public List<Student> findStudentsById(int id);
	
	public Map<String,Object> findById(int id);

	public List<Map<String,Object>> findById2(int id);
}
