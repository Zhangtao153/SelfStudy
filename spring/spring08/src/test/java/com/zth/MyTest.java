package com.zth;

import com.zth.service.imp.FlashEmail;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zth
 * @Date 2019-07-19 2:50
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class MyTest {
    @Autowired
    FlashEmail email;

    public void test(){
        email.send();
        email.receive();
    }
}
