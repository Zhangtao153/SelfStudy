package com.main;


import com.mapper.StudentMapper;
import com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-03 21:21
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String res = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

       /* Student student = new Student("zth","zth@qq.com",new Date());
        studentMapper.addStudent(student);
*/


       /* List<Student> students = studentMapper.getAllStudents();

        for (Student student1:students) {
            System.out.println(student1);
        }*/

        Map<String,Object> map = new HashMap<>();
        map.put("id",2);
        map.put("name","%stu%");

        Student student = studentMapper.getStudent(map);
        System.out.println(student);



    }
}
