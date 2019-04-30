package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;

/**
 * @author zth
 * @Date 2019-04-30 9:03
 */
public class Demo02 {
    public static void main(String[] args) throws Exception{
        Workbook workbook = new HSSFWorkbook();

        // 创建 sheet 页
        Sheet sheet = workbook.createSheet("sheet1");
        //workbook.createSheet("sheet2");
        // 创建行
        Row row = sheet.createRow(0);
        // 创建单元格
        Cell cell = row.createCell(0);
        // 给单元格设置值
        cell.setCellValue("hello");
        row.createCell(1).setCellValue("world");

        FileOutputStream fileOutputStream = new FileOutputStream("g:\\我的工作簿.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

    }
}
