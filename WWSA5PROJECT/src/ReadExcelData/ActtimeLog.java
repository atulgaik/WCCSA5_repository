package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActtimeLog {
	

		

		public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=96qhpuap9qagt");
		
		
		 //Read data from valid sheet
		//Implementation of read data from excel
		FileInputStream fis = new FileInputStream("./data/Actime.xlsx");//provide the path of file
		Workbook wb = WorkbookFactory.create(fis); // Make the file for ready to read
		
	    Sheet sheet = wb.getSheet("VALID");
     	Row row = sheet.getRow(1); // get into the desire row
	
    	Cell cell = row.getCell(0); // get into desire coloumn or interface
	    String username = cell.getStringCellValue(); //read the data from cell
	  // System.out.println(username);
	   
	    
	    driver.findElement(By.name("username")).sendKeys(username);
	    
		Row row1 = sheet.getRow(1); // get into the desire row
		
    	Cell cell1 = row1.getCell(1); // get into desire coloumn or interface
	    String pass = cell1.getStringCellValue(); 
	   System.out.println(pass);
	    driver.findElement(By.name("pwd")).sendKeys(pass);
	    driver.findElement(By.id("Loginbutton")).click();
	
     


		
		
				

}
}
