package com.zth.myTest;

import com.zth.mapper.StudentMapper;
import com.zth.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zth
 * @Date 2019-07-21 19:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/ApplicationContext.xml"})
public class Test1 {

    @Autowired
    StudentServiceImpl studentService;

    @Test
    public void test(){
        System.out.println(studentService.getAllStu());

    }
}
