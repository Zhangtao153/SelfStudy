package com.car.servlet;

import com.car.servlet.core.Action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-06-04 15:09
 */
@WebServlet("/used_car")
public class Used_car extends Action {
    @Override
    public void index(Mapping mapping) throws ServletException, IOException {

        mapping.forward("admin/add_usedcar.jsp");
    }
}
