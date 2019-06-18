package com.main;

import com.mapper.StudentMapper;
import com.pojo.Clazz;
import com.pojo.Stu;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import java.io.InputStream;
import java.util.List;

/**
 * @author zth
 * @Date 2019-06-18 16:29
 */
public class Main {
    public static void main(String[] args) throws Exception{
        String res = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper  = sqlSession.getMapper(StudentMapper.class);

        List<Clazz> stus = studentMapper.getAllClazz();

        System.out.println(stus);
    }
}
