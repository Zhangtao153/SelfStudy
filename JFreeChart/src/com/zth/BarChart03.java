package com.zth;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-05-24 20:34
 */
public class BarChart03 {
    public static String getBarChart(HttpSession session) throws IOException {
        double[][] data = new double[][]{{123,234,276},{134,167,231},{142,198,178},{122,125,153}};
        String [] rowKeys = {"苹果","香蕉","菠萝","水蜜桃"};
        String[] columnKeys = {"西安","成都","重庆"};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys,columnKeys,data);
        JFreeChart chart = ChartFactory.createBarChart3D(
                "水果销量统计图",
                "水果",
                "销售",
                dataset,
                PlotOrientation.VERTICAL,
                true,true,true);
        String fileName = ServletUtilities.saveChartAsJPEG(chart,400,300,null,session);

        return fileName;
    }
}
