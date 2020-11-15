package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile{

    public static void main(String[] args) throws IOException {

        String path = "vytrack_testusers.xlsx";
        File file = new File(path);

        Workbook workbook = WorkbookFactory.create(file);


        int numOfSheets = workbook.getNumberOfSheets();

        System.out.println("Number of Sheets: " + numOfSheets);

        //Step 2. Create object of spreadsheet
        Sheet sheet = workbook.getSheet("QA3-short");
        //step3. Read a row

        Row row1 = sheet.getRow(0);

        Cell cell1 = row1.getCell(0);

        String value1 = cell1.getStringCellValue();

        System.out.println(value1);

        workbook.forEach(sh-> System.out.println(sh.getSheetName()));


        System.out.println("########################");

        Iterator<Cell> cellIterator= row1.cellIterator();
        while (cellIterator.hasNext()){
            System.out.println(cellIterator.next().getStringCellValue());
        }


        Iterator<Row> rowIterator = sheet.rowIterator();

        while(rowIterator.hasNext()){
            Iterator<Cell> cellIterator1 = rowIterator.next().cellIterator();
            while(cellIterator1.hasNext()){
                System.out.print(cellIterator1.next().getStringCellValue()+ " ");
            }
            System.out.println();
        }





    }





}



