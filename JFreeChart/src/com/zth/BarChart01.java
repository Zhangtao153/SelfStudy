package com.zth;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.servlet.http.HttpSession;


public class BarChart01 {
    public static String getBarChart(HttpSession session) throws Exception{
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.setValue(454,"西安","苹果");
        dataset.setValue(478,"西安","香蕉");
        dataset.setValue(423,"西安","橘子");
        dataset.setValue(412,"西安","菠萝");

        JFreeChart chart  = ChartFactory.createBarChart3D("水果销售统计图","水果",
                "销售量",dataset, PlotOrientation.VERTICAL,
                true,true,true);

        String fileName = ServletUtilities.saveChartAsJPEG(chart,400,300,null,session);
        return fileName;
    }
}
