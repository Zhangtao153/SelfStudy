package com.zth.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
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

        Cell cell = row.createCell(0);


        // 设置值
        cell.setCellValue(new HSSFRichTextString("纵有红颜"));
        // 创建单元格样式
        CellStyle cellStyle = workbook.createCellStyle();
        // 设置水平方向对齐方式
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 设置垂直方向对齐方式
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        cell.setCellStyle(cellStyle);
        FileOutputStream fileOut=new FileOutputStream("g:\\工作簿.xls");
        workbook.write(fileOut);
        fileOut.close();

    }

}
