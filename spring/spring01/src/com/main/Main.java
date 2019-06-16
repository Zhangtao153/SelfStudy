package com.main;

import com.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zth
 * @Date 2019-06-16 15:32
 */
public class Main {
   public static void main(String[] args){
       ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});

       Student student = (Student) context.getBean("student");
       System.out.println(student);
   }
}
