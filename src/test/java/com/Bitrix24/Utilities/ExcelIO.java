package com.Bitrix24.Utilities;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class ExcelIO {

    @Test
    public void readExcelFile() {
        try (FileInputStream fileInputStream = new FileInputStream("VytrackTestUsers.xlsx")) {
            //.xlsx
            //XSSFWorkbook - to create an object of .xlsx  file
            //HSSFWorkbook - to create an object of .xls  file
            //Workbook - is an interface, that is implemented by XSSFWorkbook and HSSFWorkbook
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            //Object of Sheet used to represent excel file page
            //because, 1 excel document can have many spreadsheets
            Sheet sheet = workbook.getSheet("QA1-short");
            //read a first row
            Row row = sheet.getRow(0);
            //object of Cell class represents some cell. Row consists of cells
            //read a first cell
            Cell cell = row.getCell(0);
            //read a value from 1st row 1st column
            System.out.println(cell);

            //print every cell in the first row
            int columnNumber = row.getPhysicalNumberOfCells();//how many cells
            for (int i = 0; i < columnNumber; i++) {
                System.out.print(row.getCell(i) + " ");
            }
            System.out.println();
            //to get number of rows
            int rowNumber = sheet.getPhysicalNumberOfRows();
            //print first and seconds columns
            for (int i = 0; i < rowNumber; i++) {
                System.out.print(sheet.getRow(i).getCell(0) + "    ");
                System.out.print(sheet.getRow(i).getCell(1) + "    ");
                System.out.print(sheet.getRow(i).getCell(2) + "     ");
                System.out.print(sheet.getRow(i).getCell(3));
                System.out.println();
            }
            System.out.println("###################################################");
            //to print entire table
            //here we create 2D array to store data from excel file
            //to specify size of array we use number of rows and columns
            String[][] dataTable = new String[rowNumber][columnNumber];

            for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
                for (int columnIndex = 0; columnIndex < columnNumber; columnIndex++) {
                    String value = sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
                    //to print value exactly 15 characters long
                    System.out.format("%15s", value);
                    //we write data into 2D array
                    dataTable[rowIndex][columnIndex] = value;
                }
                System.out.println();
            }

            System.out.println(Arrays.deepToString(dataTable));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void writeIntoExcelFile(){
        //input stream - read
        //output stream - write
        //NOTE: close excel file during writing. Otherwise, file will crash.
        try(FileInputStream fileInputStream = new FileInputStream("VytrackTestUsers.xlsx")){
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheet("QA1-short");
            Row row = sheet.getRow(1); //get second row
            //write PASSED to 2nd row 6th column
            row.getCell(5).setCellValue("PASSED");


            FileOutputStream fileOutputStream = new FileOutputStream("VytrackTestUsers.xlsx");
            workbook.write(fileOutputStream); //to write updates to the file
            fileOutputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
