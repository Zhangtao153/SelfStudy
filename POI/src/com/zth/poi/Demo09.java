package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;

/**
 * 设置对齐方式
 */
public class Demo09 {
    public static void main(String[] args) throws Exception {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        // 设置值
        cell.setCellValue(new HSSFRichTextString("纵有\n红颜"));

        CellStyle cellStyle = workbook.createCellStyle();
        // 设置可以换行
        cellStyle.setWrapText(true);
        cell.setCellStyle(cellStyle);
        // 设置行高
        row.setHeightInPoints(2*sheet.getDefaultRowHeightInPoints());
        // 设置单元格宽度
        sheet.autoSizeColumn(2);


        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }

}
