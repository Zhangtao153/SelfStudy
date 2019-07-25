package com.zth.controller;

import com.zth.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zth
 * @Date 2019-07-22 16:38
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model model){

        model.addAttribute("msg","hello World");
        return "hello";
    }
}
