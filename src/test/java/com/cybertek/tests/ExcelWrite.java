package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelWrite {

    String filePath = "Employees.xlsx";

    @Test
    public void writeToExcelSheet() throws IOException {
        //open the Employees.xlsx using Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        //Goto "data" sheet. or goto first sheet by index
        XSSFSheet dataSheet = workbook.getSheetAt(0);



    }
}
