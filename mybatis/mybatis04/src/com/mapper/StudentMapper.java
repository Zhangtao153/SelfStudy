package com.mapper;

import com.pojo.Students;

import java.util.List;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-10 20:19
 */
public interface StudentMapper {
    // 查询所有学生
    public List<Students> getAllStudents();
    // 增加一个学生
    public void addStudents(Students students);
    // 查询一个学生
    public Students getStudent(Map<String,Object> map);

}
