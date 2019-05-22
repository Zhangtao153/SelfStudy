package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.swing.text.Style;
import java.io.FileOutputStream;

/**
 * 设置对齐方式
 */
public class Demo08 {
    public static void main(String[] args) throws Exception {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        Row row = sheet.createRow(0);
        Cell cell0 = row.createCell(0);
        // 设置值
        cell0.setCellValue(new HSSFRichTextString("纵有红颜"));

        //  创建字体处理类
        Font font = workbook.createFont();
        font.setFontHeightInPoints((short)30);
        font.setFontName("宋体");
        font.setColor(IndexedColors.RED.getIndex());
        font.setItalic(true);
        font.setStrikeout(true);

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell0.setCellStyle(cellStyle);

        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }

}
