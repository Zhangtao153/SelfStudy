package com.zth;

import com.zth.jopo.Stu;
import com.zth.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
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

        Stu stu = new Stu();
        stu.setSex("F");
        stu.setAge(23);

        List<Stu> stus = studentMapper.getAllStudents(stu);
        System.out.println(stus);

    }

    @Test
    public void testgetAllstu1(){
        InputStream inputStream = StudentMapperTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        Stu stu = new Stu();
        stu.setSex("M");
        stu.setAge(23);

        List<Stu> stus = studentMapper.getAllStudents1(stu);
        System.out.println(stus);

    }

    @Test
    public void testgetAllstu2(){
        InputStream inputStream = StudentMapperTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        Stu stu = new Stu();
        stu.setAge(23);

        List<Stu> stus = studentMapper.getAllStudents2(stu);
        System.out.println(stus);

    }

    @Test
    public void testUpdateStu(){
        InputStream inputStream = StudentMapperTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        Stu stu = new Stu();
        stu.setId(4);
        stu.setAge(22);

        studentMapper.updateStu(stu);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testGetStuIN(){
        InputStream inputStream = StudentMapperTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List list = new ArrayList();
        list.add(1);
        list.add(3);


        List<Stu> stus = studentMapper.getStudentsIn(list);
        System.out.println(stus);
        sqlSession.close();
    }
}
