package com.zth;

import org.springframework.stereotype.Component;

@Component
public class Email{

    public void send() throws Exception {
        System.out.println("发送中。。。");
    }

}
