package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zth
 * @Date 2019-06-09 20:28
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    public static SqlSessionFactory getSqlSessionFactory(){
        if (null == sqlSessionFactory){

            try {
                InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }
}
