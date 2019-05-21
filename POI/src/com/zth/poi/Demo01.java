package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-04-30 8:45
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        Workbook workbook = new HSSFWorkbook();  // 定义一个工作簿

        FileOutputStream out = new FileOutputStream("g:/工作簿001.xls");

        // 创建 sheet 页
        Sheet sheet1 = workbook.createSheet("sheet1");
        Sheet sheet2 = workbook.createSheet("sheet2");

        workbook.write(out);
        out.close();
        System.out.println("OK");
    }
}
