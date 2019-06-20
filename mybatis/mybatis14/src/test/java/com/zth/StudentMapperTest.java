package com.zth;

import com.zth.jopo.Clazz;
import com.zth.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author zth
 * @Date 2019-06-20 23:28
 */
public class StudentMapperTest {
    private static Logger log = Logger.getLogger(StudentMapperTest.class);

    @Test
    public void testgetAllClazz(){
        InputStream inputStream = StudentMapperTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Clazz> clazzes = studentMapper.getAllClazz();
        System.out.println(clazzes);
        sqlSession.close();

        System.out.println("$$$$$$$$$$$$$");

        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        StudentMapper studentMapper1 = sqlSession1.getMapper(StudentMapper.class);

        List<Clazz> clazzes2 = studentMapper1.getAllClazz();
        System.out.println(clazzes2);

    }
}
