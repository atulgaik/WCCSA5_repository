package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filb {
// to store generic reusable methods
	
	//all the methods are non static
	
	//its used to read data from excel sheet
	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);// provide the path
		
		Workbook wb = WorkbookFactory.create(fis); // Make the file for ready to read
		
	    Sheet sheet = wb.getSheet(sheetname);//get into sheet
	   Row row = sheet.getRow(rowcount);//get into desire row
	  Cell cell = row.getCell(cellcount);
	  String data=cell.getStringCellValue();
	  return data;
	}
	//its used to get last row of data
	
	public int getLastRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); // provide file path
		Workbook wb = WorkbookFactory.create(fis); // Make the file for ready to read
		 Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
	
	//its used to write the data into excel sheet
	
	public void writeExcelData(String excelpath,String sheetname,int rowc,int cellc, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);//provide the path of file
		Workbook wb = WorkbookFactory.create(fis); // Make the file for ready to read
		
	    Sheet sheet = wb.getSheet(sheetname);
	   Row row = sheet.createRow(rowc);
	 
	    
	   Cell cell = row.createCell(cellc);
	    cell.setCellValue(data);
	    FileOutputStream fos = new FileOutputStream(excelpath);
	    wb.write(fos);       
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	}
	}
	
	

