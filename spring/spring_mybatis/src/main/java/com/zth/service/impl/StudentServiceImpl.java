package com.zth.service.impl;

import com.zth.bean.Student;
import com.zth.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zth
 * @Date 2019-07-21 20:10
 */
@Service
public class StudentServiceImpl implements StudentMapper {
    @Autowired
    StudentMapper studentMapper;


    @Override
    public List<Student> getAllStu() {
        return studentMapper.getAllStu();
    }

    @Override
    public int insert(Student student) {
        return 0;
    }
}
