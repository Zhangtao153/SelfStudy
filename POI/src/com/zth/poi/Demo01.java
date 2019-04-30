package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zth
 * @Date 2019-04-30 8:45
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook(); //  定义一个新的工作簿

        FileOutputStream fileOutputStream = new FileOutputStream("g:\\我的工作簿.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        System.out.println("OK");
    }
}
