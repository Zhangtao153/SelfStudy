package com.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.mapper.StudentsMapper;
import com.pojo.PhoneNumber;
import com.pojo.SexEnum;
import com.pojo.Students;
/**
 * 测试代码
 * @author ASUS
 *
 */
public class Main {

	private static Logger logger=Logger.getLogger(Main.class);
	public static void main(String[] args) throws IOException {
		//step1:得到SqlSessionFactory   相当于连接池
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//step2:得到SqlSession    相当于connection
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentsMapper sm=sqlSession.getMapper(StudentsMapper.class);
		
		//step3:查询信息
		Students s=new Students("王五2","66666@qq.com",new Date(),SexEnum.MALE);
        sm.addStudents(s);
		
		/*Students stu=sm.getStudentById(9);
		System.out.println(stu);*/
		logger.info("查寻一个学生");
		sqlSession.commit();
		System.out.println("ok");
	}
}
