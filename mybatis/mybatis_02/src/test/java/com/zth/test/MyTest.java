package com.zth.test;

import com.zth.mapper.StudentMapper;
import com.zth.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author zth
 * @Date 2019-07-13 20:13
 */
public class MyTest {
    @Test
    public void getAllStudent(){
        InputStream inputStream = MyTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.getAllStu();
        System.out.println(students);
    }
}
