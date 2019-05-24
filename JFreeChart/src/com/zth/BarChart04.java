package com.zth;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.TextAnchor;

import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-05-24 20:34
 */
public class BarChart04 {
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


        CategoryPlot plot = chart.getCategoryPlot();
        // 设置网格beijingse
        plot.setBackgroundPaint(Color.WHITE);
        // 设置网格竖线颜色
        plot.setDomainGridlinePaint(Color.pink);
        // 设置网格横线颜色
        plot.setRangeGridlinePaint(Color.pink);

        // 显示每个柱的数值，并修改该数值的字体属性
        BarRenderer3D renderer=new BarRenderer3D();
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);

        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
        renderer.setItemLabelAnchorOffset(10D);

        // 设置平行柱的之间距离
        renderer.setItemMargin(0.4);
        plot.setRenderer(renderer);

        String fileName = ServletUtilities.saveChartAsJPEG(chart,400,300,null,session);

        return fileName;
    }
}
