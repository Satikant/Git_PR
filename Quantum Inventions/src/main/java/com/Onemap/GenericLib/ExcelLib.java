package com.Onemap.GenericLib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String path=" ";
	public String getExceldata(String SheetName,int Rownum,int Colnum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row rw=sh.getRow(Rownum);
		Cell cel=rw.getCell(Colnum);
		String Data=cel.getStringCellValue(	);
		wb.close();
		return Data;
	}


}
