package com;

import com.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zth
 * @Date 2019-06-22 22:12
 */
@Configuration
@ComponentScan(basePackages = {"com"})
public class StuConfig {

    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        return student;
    }
}
