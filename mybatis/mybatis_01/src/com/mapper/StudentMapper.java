package com.mapper;

import com.pojo.Student;

import java.util.List;

/**
 * @author zth
 * @Date 2019-07-13 11:55
 */
public interface StudentMapper {
    // 查询所有学生
    public List<Student> getAllStu();
    // 添加学生
    public void addStu(Student student);
}
