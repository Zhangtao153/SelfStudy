package com.main;

import com.mapper.StudentMapper;
import com.pojo.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;


import java.io.InputStream;
import java.util.List;

/**
 * @author zth
 * @Date 2019-06-10 20:35
 */
public class Main {
    Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{
        String res = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Students> students = studentMapper.getAllStudents();

        for (Students students1:students) {
            System.out.println(students1);
        }
    }
}
