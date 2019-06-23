package com.zth;

import com.bean.Student;
import com.bean.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zth
 * @Date 2019-06-23 9:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/ApplicationContext.xml"})
public class MyTest {

    @Autowired
    Teacher teacher;
    @Test
    public void test(){
        System.out.println(teacher);
    }
}
