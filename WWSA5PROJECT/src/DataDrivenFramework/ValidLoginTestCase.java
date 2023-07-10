package DataDrivenFramework;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase  {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=96qhpuap9qagt");
		//read the data from excel amd test login page
		Filb f = new Filb();
	//String username = f.readExcelData("./data/Actime.xlsx","VALID",1,0);
	//String validPassword = f.readExcelData("./data/Actime.xlsx","VALID",1,1);


	driver.findElement(By.name("username")).sendKeys(f.readExcelData("./data/Actime.xlsx","VALID",1,0));// direct method call and argument pass through it
	driver.findElement(By.name("pwd")).sendKeys(f.readExcelData("./data/Actime.xlsx","VALID",1,1));
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	}

}
