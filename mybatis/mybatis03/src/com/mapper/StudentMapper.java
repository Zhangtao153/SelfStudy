package com.mapper;

import com.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-08 14:51
 */
public interface StudentMapper {

    // 查询所有学生
    public List<Student> getAllStudents();
    // 增加一个学生
    public void addStudent(Student student);
    // 查询一个学生
    public Student getStudent(int id);
    // 修改
    public int update(Student student);
    // 删除
    public int delete(Student student);
}
