package com.car.servlet;

import com.car.bean.Customer;
import com.car.bean.Used_car;
import com.car.servlet.core.Action;
import com.db.DB;
import com.db.PageDiv;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author zth
 * @Date 2019-06-05 15:24
 */
@WebServlet("/kuhu_list")
public class Kuhu_list extends Action {
    @Override
    public void index(Mapping mapping) throws ServletException, IOException {
        PageDiv<Customer> pageDiv = new PageDiv<>();

        int pageSize = 10;
        int paseNo = 1;

        if (mapping.getInt("pageNo")>0){
            paseNo = mapping.getInt("pageNo");
        }

        try {
            pageDiv = DB.getByPage(Customer.class,"select * from customer ",paseNo,pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(pageDiv.getList().get(1).toString());
        mapping.setAttr("pageDiv",pageDiv);
        mapping.forward("admin/kehuMessage.jsp");
    }
}
