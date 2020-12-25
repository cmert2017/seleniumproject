package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInToExcelFile {

    public static void main(String[] args) throws IOException {


        String path = "vytrack_testusers.xlsx";
        FileInputStream file= new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet("QA2-short");
        Row row1 = sheet.getRow(2);

        System.out.println("Before row1.getCell(4) = " + row1.getCell(4));

        row1.getCell(4).setCellValue("FAILED");

        System.out.println("After row1.getCell(4) = " + row1.getCell(4));

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);


        workbook.close();
        fileOutputStream.close();
        file.close();

    }




}
