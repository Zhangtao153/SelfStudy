package com.Main;

import com.mapper.StudentMapper;
import com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zth
 * @Date 2019-07-13 12:08
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String resou = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resou);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.getAllStu();
        System.out.println(students);

    }
}
