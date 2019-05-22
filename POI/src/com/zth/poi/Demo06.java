package com.zth.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 设置对齐方式
 */
public class Demo06 {
    public static void main(String[] args) throws Exception {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        Row row = sheet.createRow(0);
        row.setHeightInPoints(30);

        Cell cell0 = row.createCell(0);
        Cell cell1 = row.createCell(1);

        // 设置值
        cell0.setCellValue(new HSSFRichTextString("纵有红颜"));
        // 创建单元格样式
        CellStyle cellStyle = workbook.createCellStyle();
        CellStyle cellStyle1 = workbook.createCellStyle();
        // 设置背景色
        cellStyle.setFillBackgroundColor(IndexedColors.RED.getIndex());
        cellStyle.setFillPattern(CellStyle.BIG_SPOTS);
        cell0.setCellStyle(cellStyle);

        // 设置前景色
        cellStyle1 .setFillForegroundColor(IndexedColors.PINK.getIndex());
        cellStyle1.setFillPattern(CellStyle.SOLID_FOREGROUND);
        cell1.setCellStyle(cellStyle1);

        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }

}
