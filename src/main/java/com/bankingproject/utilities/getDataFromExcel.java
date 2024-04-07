package com.bankingproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getDataFromExcel
{
	public static String getData(int i, int j) throws IOException 
	{
		File file = new File("C:\\Users\\DELL\\Downloads\\for testing.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row =  sheet.getRow(i);
		XSSFCell cell =  row.getCell(j);
		String data = cell.getStringCellValue();
		return data;
		
		
		
	}
}
