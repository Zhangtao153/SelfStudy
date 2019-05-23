package com.zth.ExportExcel;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-05-22 16:44
 */
public class ExcelUtil {
    public static void getHSSFWorkbook(String sheetNmae,Object[] title,Object[][] values){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(sheetNmae);

        HSSFRow row = sheet.createRow(0);
        row.setHeightInPoints(sheet.getDefaultRowHeightInPoints()*2);

        CellStyle cellStyle = workbook.createCellStyle();
        // 设置水平方向对齐方式
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 设置垂直方向对齐方式
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        // 存储最大列宽
        Map<Integer,Integer> maxWidth = new HashMap<>();


        // 填充表头
        for (int i = 0; i < title.length; i++) {
            Cell cell = row.createCell(i);
           if (null != title[i]){
               cell.setCellValue(title[i].toString());
               maxWidth.put(i,cell.getStringCellValue().getBytes().length * 256 +800);
           }
            cell.setCellStyle(cellStyle);
        }


        int length ;
        // 填充表体
        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i+1);
            for (int j = 0; j < values[i].length; j++) {
                if (null != values[i][j]){
                    Cell cell = row.createCell(j);
                    cell.setCellValue(values[i][j].toString());
                    cell.setCellStyle(cellStyle);
                    length = cell.getStringCellValue().getBytes().length*256 +800;
                    if (length > 15000){
                        length = 15000;
                    }
                    if (null != maxWidth.get(j) && maxWidth.get(j) < length){
                        maxWidth.put(j,length);
                    }
                }
            }
        }

        // 列宽自适应
        for (int i = 0; i < title.length; i++) {
            if (null != maxWidth.get(i)){
                sheet.setColumnWidth(i,maxWidth.get(i));
            }

        }

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("g:/工作簿.xls");
            workbook.write(out);

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(maxWidth.toString());
        System.out.println("OK");


    }
    public static void main(String[] args){
        String[] title= new String[]{"id","name",null,"sex"};

        String [][] arr = new String [][]{
                {"ahjda","asdjnakd","asdasgs"},
                {"ahjda","asdjnakd","asdasgs"},
                {"ahjda","南京的雨不停的下不停的下南京的雨不停的下不停的下南京的雨不停的下不停的下","asdasgs","asadsadada"}
        };
        getHSSFWorkbook("sheet001",title,arr);
    }
}














