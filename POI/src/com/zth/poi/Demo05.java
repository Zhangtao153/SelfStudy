package com.zth.poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.FileInputStream;
/**
 * 遍历EXcel
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("g:/工作簿.xls");
        POIFSFileSystem fileSystem = new POIFSFileSystem(in);
        HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
        // 获取第一个 sheet 页
        HSSFSheet sheet = workbook.getSheetAt(0);

        if (null != sheet){
            // 遍历行
            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                HSSFRow row = sheet.getRow(i);
                if (null != row){
                    // 遍历列
                    for (int j = 0; j <= row.getLastCellNum(); j++) {
                        HSSFCell cell = row.getCell(j);
                        if (null != cell){
                            System.out.print("\t"+getValue(cell));
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    private static String getValue(HSSFCell cell){
        if (cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN){
            return String.valueOf(cell.getBooleanCellValue());
        }else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
            return String.valueOf(cell.getNumericCellValue());
        }else {
            return String.valueOf(cell.getStringCellValue());
        }
    }
}
