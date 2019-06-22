package com.zth;

import com.StuConfig;
import com.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zth
 * @Date 2019-06-22 22:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {StuConfig.class})
public class MyTest {
    @Autowired
    Student student;

    @Test
    public void test(){
        System.out.println(student);
    }
}
