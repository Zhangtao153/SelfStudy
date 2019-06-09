package com.test;

import com.mapper.StudentMapper;
import com.pojo.Student;
import com.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * @author zth
 * @Date 2019-06-09 21:13
 */
public class Student01 {

    private static Logger logger = Logger.getLogger(Student01.class);

    public static void main(String[] args){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        /*Student student = studentMapper.getStudent(2);
        System.out.println(student);*/
        List<Student> students = studentMapper.getAllStudents();
        System.out.println(students);
    }
}
