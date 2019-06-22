package com.zth;

import com.zth.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zth
 * @Date 2019-06-22 19:58
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student student = (Student)context.getBean("stu");
        System.out.println(student);
    }
}
