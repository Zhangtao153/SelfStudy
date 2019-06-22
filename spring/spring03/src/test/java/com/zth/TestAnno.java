package com.zth;

import com.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zth
 * @Date 2019-06-22 20:39
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/ApplicationContext.xml"})
public class TestAnno {

    @Autowired
    Student student;
    @Test
    public void testXML(){
        System.out.println(student);
    }
}
