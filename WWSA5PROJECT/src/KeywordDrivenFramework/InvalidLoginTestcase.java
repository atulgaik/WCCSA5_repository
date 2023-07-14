package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestcase extends Basttest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Basttest bt = new Basttest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, "INVALID");
		
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH,"INVALID",i,0));
			Thread.sleep(2000);
            driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH,"INVALID",i,1));
            driver.findElement(By.id("loginButton")).click();
            driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
	}

}