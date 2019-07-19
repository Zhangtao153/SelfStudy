package com.zth;

import com.zth.service.Email;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author zth
 * @Date 2019-07-19 10:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/ApplicationContext.xml"})
public class MyTest {

    @Autowired
    Email email;
    @Test
    public void test() throws Exception {
        email.send();
    }

}
