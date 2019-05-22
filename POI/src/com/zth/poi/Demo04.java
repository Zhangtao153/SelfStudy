package com.zth.poi;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 遍历 Excel
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("g:/工作簿.xls");

        POIFSFileSystem fileSystem = new POIFSFileSystem(in);
        HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);

        ExcelExtractor extractor = new ExcelExtractor(workbook);

        extractor.setIncludeSheetNames(false);
        System.out.println(extractor.getText());
    }
}
