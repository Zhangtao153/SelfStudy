package com.zth.mapper;

import com.zth.bean.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zth
 * @Date 2019-07-21 19:36
 */

public interface StudentMapper {
    @Select("select * from students")
    List<Student> getAllStu();

    public int insert(Student student);
}
