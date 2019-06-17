package com.car.servlet;

import com.car.servlet.core.Action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-06-05 13:55
 */
@WebServlet("/pic")
public class Pic extends Action {
    @Override
    public void index(Mapping mapping) throws ServletException, IOException {

    }

    public void jiageqiushi(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/priceQushi.jsp");
    }

    public void changshangfenbu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/changshangfenbu.jsp");
    }

    public void diqufenbu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/diqufenbu.jsp");
    }


    public void posun(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/posun.jsp");
    }

    public void shijian(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/shijian.jsp");
    }

    public void kucunquyu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/kucunquyu.jsp");
    }

    public void kucunchengben(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/kucunchengben.jsp");
    }

    public void weixiu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/weixiu.jsp");
    }

    /*第四模块*/
    public void kehufenbu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/kehufenbu.jsp");
    }

    public void agefenbu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/agefenbu.jsp");
    }

    public void shourufenbu(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/shourufenbu.jsp");
    }

    public void jiating(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/jiating.jsp");
    }


    public void chushouprice(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/chushouprice.jsp");
    }


    public void chukufenxi(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/chukufenxi.jsp");
    }
}
