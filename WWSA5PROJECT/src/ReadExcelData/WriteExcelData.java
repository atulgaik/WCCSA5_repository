package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
//Read data from IPL sheet
		//Implementation of read data from excel
		FileInputStream fis = new FileInputStream("./data/Test_data.xlsx");//provide the path of file
		Workbook wb = WorkbookFactory.create(fis); // Make the file for ready to read
		
	    Sheet sheet = wb.getSheet("IPL");
	   Row row = sheet.createRow(11);
	  //  Row row = sheet.getRow(1);
	    // create the by using interface
	   Cell cell = row.createCell(0);
	    cell.setCellValue("Pune");
	    FileOutputStream fos = new FileOutputStream("./data/Test_data.xlsx");
	    wb.write(fos);       
	    
	  
	

}
}
