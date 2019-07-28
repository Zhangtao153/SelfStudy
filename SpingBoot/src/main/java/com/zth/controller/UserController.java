package com.zth.controller;

import com.zth.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zth
 * @Date 2019-07-25 11:25
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String getUser1( Model model){

        List<User> list = new ArrayList<>();
        list.add(new User("张三",20));
        list.add(new User("李四",22));
        list.add(new User("王五",24));
        model.addAttribute("userList",list);
        System.out.println(list.toString());
        return "userList";

    }
}
