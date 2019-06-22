package com.zth;

import com.zth.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zth
 * @Date 2019-06-22 20:39
 */
public class TestXML {

    @Test
    public void testXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student)context.getBean("stu");
        System.out.println(student);
    }
}
