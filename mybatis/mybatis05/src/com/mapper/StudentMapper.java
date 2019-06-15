package com.mapper;

import com.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-15 15:14
 */
public interface StudentMapper {

    public List<Map<String,Object>> getStuByName(Map<String, Object> map);

    public void addStudent(Student student);
}
