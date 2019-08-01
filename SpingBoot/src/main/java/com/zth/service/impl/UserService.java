package com.zth.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author zth
 * @Date 2019-08-01 16:25
 */
@Service
public class UserService {
    public void addUser(){
        System.out.println("add user..."+new Date());
    }
}
