package com.cybertek.tests.day14_excel_io;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile2 {

    public static void main(String[] args) throws IOException {
        String path = "vytrack_testusers.xlsx";
        File file = new File(path);

        //XSSFWorkBook - xlsx new version
        //HSSFWorkBook - xls old version
        Workbook workbook = WorkbookFactory.create(file);
        Workbook workbook1 = new HSSFWorkbook();

        Sheet sheet = workbook.getSheet("QA3-short");

        //get number of rows
        int rowNum = sheet.getLastRowNum();

        //get number of columns
        int colNum = sheet.getRow(0).getLastCellNum();

        //outer loop to iterate rows
        for(int rowIndex =0; rowIndex <= rowNum;rowIndex++ ){
            //inner loop to iterate cells
            for (int colIndex = 0 ; colIndex < colNum ;colIndex++){

                System.out.print(sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue()+ " ");

            }
            System.out.println();
        }


        System.out.println("#################for each loop");

        for (Row cells : sheet) {

            for (Cell cell : cells) {
                System.out.printf("%-15s  ", cell);
            }
            System.out.println();
        }


    }
}
