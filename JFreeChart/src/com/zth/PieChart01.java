package com.zth;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.text.NumberFormat;

/**
 * @author zth
 * @Date 2019-05-24 23:13
 */
public class PieChart01 {
    public static String getPieChart(HttpSession session) throws Exception{
        DefaultPieDataset dataset = new DefaultPieDataset();

        dataset.setValue("java",0.15876);
        dataset.setValue("C",0.12424);
        dataset.setValue("python",0.07574);

        dataset.setValue("其他",0.64126);

        JFreeChart chart = ChartFactory.createPieChart("编程语言排行",dataset,true,true,true);
        // 消除锯齿，文字显示更清晰
        //chart.getRenderingHints().put(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        // 副标题
        chart.addSubtitle(new TextTitle("2019年2月"));
        PiePlot piePlot = (PiePlot)chart.getPlot();
        piePlot.setLabelFont(new Font("宋体",0,11));
        // 设置饼图是圆的（true），还是椭圆的（false）；默认为true
        piePlot.setCircular(true);
        // 没有数据的时候显示的内容
        piePlot.setNoDataMessage("无数据显示");

        // {0} 表示选项， {1} 表示数值， {2} 表示所占比例
        // {0}:({1}.{2})
        // {{0}={1}({2})
        StandardPieSectionLabelGenerator standarPieIG = new StandardPieSectionLabelGenerator(
                "{0}({2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());
        piePlot.setLabelGenerator(standarPieIG);

        // 突出显示
        piePlot.setExplodePercent("java",0.15876);

        String fileName = ServletUtilities.saveChartAsPNG(chart,400,300,null,session);

        return fileName;
    }
}
