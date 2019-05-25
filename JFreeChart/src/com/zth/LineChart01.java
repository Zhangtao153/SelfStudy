package com.zth;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.TextAnchor;

import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-05-25 9:54
 */
public class LineChart01 {
    public static String getLineChart(HttpSession session) throws IOException {
        // A网站访问量统计
        TimeSeries timeSeries1 = new TimeSeries("A网站", Month.class);
        timeSeries1.add(new Month(1,2019),200);
        timeSeries1.add(new Month(2,2019),250);
        timeSeries1.add(new Month(3,2019),320);
        timeSeries1.add(new Month(4,2019),480);
        timeSeries1.add(new Month(5,2019),305);
        timeSeries1.add(new Month(6,2019),400);
        timeSeries1.add(new Month(7,2019),510);
        timeSeries1.add(new Month(8,2019),650);
        timeSeries1.add(new Month(9,2019),340);
        timeSeries1.add(new Month(10,2019),550);
        timeSeries1.add(new Month(11,2019),700);
        timeSeries1.add(new Month(12,2019),750);


        // B网站访问量统计
        TimeSeries timeSeries2 = new TimeSeries("A网站", Month.class);
        timeSeries2.add(new Month(1,2019),85);
        timeSeries2.add(new Month(2,2019),120);
        timeSeries2.add(new Month(3,2019),220);
        timeSeries2.add(new Month(4,2019),320);
        timeSeries2.add(new Month(5,2019),450);
        timeSeries2.add(new Month(6,2019),580);
        timeSeries2.add(new Month(7,2019),790);
        timeSeries2.add(new Month(8,2019),1000);
        timeSeries2.add(new Month(9,2019),820);
        timeSeries2.add(new Month(10,2019),530);
        timeSeries2.add(new Month(11,2019),720);
        timeSeries2.add(new Month(12,2019),900);


        // 定义时间序列集合
        TimeSeriesCollection seriesCollection = new TimeSeriesCollection();
        seriesCollection.addSeries(timeSeries1);
        seriesCollection.addSeries(timeSeries2);

        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "网站访问量统计对比图",
                "月份",
                "访问量",
                seriesCollection,
                true,
                true,
                true);

        //设置主标题
        chart.setTitle(new TextTitle("A,B网站访问量统计对比图", new Font("宋体", Font.ITALIC, 15)));
        //设置子标题
        TextTitle subtitle = new TextTitle("2019年度", new Font("黑体", Font.BOLD, 12));

        //设置时间轴的范围。
        XYPlot plot = (XYPlot) chart.getPlot();
        DateAxis dateaxis = (DateAxis)plot.getDomainAxis();
        dateaxis.setDateFormatOverride(new java.text.SimpleDateFormat("M月"));
        dateaxis.setTickUnit(new DateTickUnit(DateTickUnit.MONTH,1));

        //设置曲线是否显示数据点
        XYLineAndShapeRenderer xylinerenderer = (XYLineAndShapeRenderer)plot.getRenderer();
        xylinerenderer.setBaseShapesVisible(true);


        //设置曲线显示各数据点的值
        XYItemRenderer xyitem = plot.getRenderer();
        xyitem.setBaseItemLabelsVisible(true);
        xyitem.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_CENTER));
        xyitem.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator());
        xyitem.setBaseItemLabelFont(new Font("宋体", 1, 12));
        plot.setRenderer(xyitem);


        chart.addSubtitle(subtitle);
        chart.setAntiAlias(true);


        String fileName = ServletUtilities.saveChartAsPNG(chart,400,300,null,session);

        return fileName;
    }
}
