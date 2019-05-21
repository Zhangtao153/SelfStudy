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

        Sheet sheet = workbook.createSheet("sheet1");

        // 创建行
        Row row = sheet.createRow(0);

        // 创建单元格
        Cell cell = row.createCell(0);

        // 给单元格赋值
        cell.setCellValue("你好啊！");

        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }
}
