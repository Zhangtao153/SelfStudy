package com.main;

import com.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-15 15:53
 */
public class Main {
    public static void main(String[] args){
        InputStream inputStream = Main.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        Map<String ,Object> map = new HashMap<>();
        map.put("id",0);
        map.put("name","stu");
        List<Map<String, Object>> stus = studentMapper.getStuByName(map);

        for (Map<String,Object> map1:stus) {
            Iterator<Map.Entry<String,Object>> iterator = map1.entrySet().iterator();

            while (iterator.hasNext()){
                Map.Entry<String,Object> entry = iterator.next();
                System.out.println(entry.getKey()+"---->"+entry.getValue());
            }
        }

        System.out.println(stus);
    }
}
