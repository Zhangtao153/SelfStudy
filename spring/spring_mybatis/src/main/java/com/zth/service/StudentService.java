package com.zth.service;

import com.zth.bean.Student;

import java.util.List;

/**
 * @author zth
 * @Date 2019-07-21 20:08
 */
public interface StudentService {
    List<Student> getAllStu();
    public int insert(Student student);
}
