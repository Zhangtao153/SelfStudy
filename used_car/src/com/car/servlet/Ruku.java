package com.car.servlet;

import com.car.servlet.core.Action;
import com.db.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author zth
 * @Date 2019-06-04 14:32
 */

@WebServlet("/ruku")
public class Ruku extends Action {
    @Override
    public void index(Mapping mapping) throws ServletException, IOException {
        mapping.forward("admin/add_usedcar.jsp");
    }

    public void saveadd(Mapping mapping) throws ServletException, IOException{
        com.car.bean.Used_car car =new com.car.bean.Used_car();
        mapping.getBean(car);

        System.out.println(car.toString());

        try {
            DB.add(car);
            mapping.setAttr("msg","添加成功");
        } catch (SQLException e) {
            mapping.setAttr("err","添加失败");
            e.printStackTrace();
        }
        mapping.forward("admin/welcome.jsp");
    }
}
