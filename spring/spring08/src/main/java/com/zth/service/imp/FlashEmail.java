package com.zth.service.imp;

import com.zth.service.Email;
import org.springframework.stereotype.Component;

/**
 * @author zth
 * @Date 2019-07-19 2:37
 */
@Component
public class FlashEmail implements Email {
    @Override
    public void send() {
        System.out.println("邮件发送中。。。");
    }

    @Override
    public void receive() {
        System.out.println("邮件接收中。。。");
    }
}
