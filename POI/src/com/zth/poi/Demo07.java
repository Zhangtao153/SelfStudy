package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;

/**
 * 设置对齐方式
 */
public class Demo07 {
    public static void main(String[] args) throws Exception {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        Row row = sheet.createRow(0);
        Cell cell0 = row.createCell(0);

        // 设置值
        cell0.setCellValue(new HSSFRichTextString("纵有红颜"));

        sheet.addMergedRegion(new CellRangeAddress(
                0,  // 起始行
                1,  // 终止行
                0,   // 起始列
                1    // 终止列
        ));

        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }

}
