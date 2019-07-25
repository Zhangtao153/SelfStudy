package com.zth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * @author zth
 * @Date 2019-07-23 23:31
 */
@Controller
public class AddUser {
   /* @RequestMapping("addUser")
    public String addUser(HttpServletRequest request, HttpSession session){

        // request 作用域
        request.setAttribute("req","HttpServletRequest 的值");
        // session 作用域
        session.setAttribute("sess1","HttpSession 的值1");
        request.getSession().setAttribute("sess2","HttpSession 的值2");
        // application 作用域
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("appli","application 的值");

        return "hello";
    }*/

    @RequestMapping("addUser")
    public ModelAndView addUser() {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("modelandview","model and view的值");

        return modelAndView;
    }


}