package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zth
 * @Date 2019-05-21 22:49
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet();
        Row row = sheet.createRow(0);


        CreationHelper creationHelper = workbook.getCreationHelper();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-mm-dd hh:mm:ss"));
        Cell cell = row.createCell(0);
        cell.setCellStyle(cellStyle);
        cell.setCellValue(new Date());

        Cell cell1 = row.createCell(1);
        cell1.setCellStyle(cellStyle);
        cell1.setCellValue(Calendar.getInstance());


        FileOutputStream out = new FileOutputStream("g:/工作簿.xls");
        workbook.write(out);

        out.close();
        System.out.println("OK");
    }
}
