package com;

import com.bean.Student;
import com.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author zth
 * @Date 2019-06-22 22:12
 */
@Configuration
@ComponentScan(basePackages = {"com"})
public class Config {

    @Bean(initMethod = "init" ,destroyMethod = "destroy")
    public Teacher teacher(){

        return new Teacher();
    }
}
