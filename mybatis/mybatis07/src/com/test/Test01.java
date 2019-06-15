package com.test;

import com.mapper.StudentMapper;
import com.pojo.Stu;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author zth
 * @Date 2019-06-15 20:19
 */
public class Test01 {


    public static void main(String[] args){
        InputStream inputStream = Test01.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Stu> stus = studentMapper.getAllStus02();
        System.out.println(stus);
    }
}
