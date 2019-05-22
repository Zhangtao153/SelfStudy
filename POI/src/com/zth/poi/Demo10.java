package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileOutputStream;

/**
 * 设置对齐方式
 */
public class Demo10 {
    public static void main(String[] args) throws Exception {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        Cell cell0 = row.createCell(1);

        DataFormat dataFormat = workbook.createDataFormat();
        // 设置值
        cell.setCellValue(1234234.21312);
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(dataFormat.getFormat("0.00"));
        cell.setCellStyle(cellStyle);

        cell0.setCellValue(1234234.21312);
        CellStyle cellStyle0 = workbook.createCellStyle();
        cellStyle0.setDataFormat(dataFormat.getFormat("#,#0.00"));
        cell0.setCellStyle(cellStyle0);


        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }

}
