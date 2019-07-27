package com.zth.controller;

import com.zth.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zth
 * @Date 2019-07-25 11:25
 */
@RestController // 声明 Rest 风格控制器
@RequestMapping("user")
public class UserController {
    @RequestMapping("{age}")
    @ResponseBody
    public User getUser(@PathVariable("age")int age ){
        User user = new User("张三",age);
        return user;
    }

    @RequestMapping("{name}/{age}")
    @ResponseBody
    public User getUser1(@PathVariable("name") String name,@PathVariable("age") int age){
        User user = new User(name,age);
        return user;
    }
}
