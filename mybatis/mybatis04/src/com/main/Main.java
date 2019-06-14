package com.main;

import com.mapper.StudentMapper;
import com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-10 20:35
 */
public class Main {


    public static void main(String[] args) throws IOException {

        String res = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(com.mapper.StudentMapper.class);



        // findAllStudents
        /*studentMapper.findAllStudents();
        List<Student> students = studentMapper.findAllStudents();

        for (Student student: students) {
            System.out.println(student);
        }*/

       // findStudentById
      /* Student student = studentMapper.findStudentById(1);
       System.out.println(student);*/

      // insertStudent
       /* Student student01 = new Student("zth","zth@qq.com",new Date());
        studentMapper.insertStudent(student01);
        sqlSession.commit();*/

       // findStudentsById
       /* List<Student> students = studentMapper.findStudentsById(2);
        for (Student student: students) {
            System.out.println(student);
        }*/

       // findById
       /* Map<String,Object> stu  = studentMapper.findById(1);
        System.out.println(stu);*/

       //findById2
        List<Map<String,Object>> stus = studentMapper.findById2(1);

        for (Map<String,Object> map:stus){
            Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();

            while (iterator.hasNext()){
                Map.Entry<String,Object> entry = iterator.next();
                System.out.println(entry.getKey()+"---->"+entry.getValue());
            }
        }

        sqlSession.close();


    }
}
