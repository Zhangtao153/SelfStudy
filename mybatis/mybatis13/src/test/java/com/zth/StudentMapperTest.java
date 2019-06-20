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

        System.out.println("@@@@@@@@@@@@@@@@@@@@");
        List<Clazz> clazzes2 = studentMapper.getAllClazz();
        System.out.println(clazzes2);
        sqlSession.close();
    }
}
