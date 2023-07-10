package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=96qhpuap9qagt");
		//read the data from excel and test login page
		Filb f = new Filb();
		int rc = f.getLastRowCount("./data/Actime.xlsx","INVALID");
		
		for(int i=1;i<=rc;i++) {
	//String username = f.readExcelData("./data/Actime.xlsx","INVALID",i,0);  //method called and store in one variable pass to yhe sendkeys
	//String validPassword = f.readExcelData("./data/Actime.xlsx","INVALID",i,1);


	driver.findElement(By.name("username")).sendKeys(f.readExcelData("./data/Actime.xlsx","INVALID",i,0));
	driver.findElement(By.name("pwd")).sendKeys(f.readExcelData("./data/Actime.xlsx","INVALID",i,1));
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.name("username")).clear();
	Thread.sleep(2000);
	f.writeExcelData("./data/Actime.xlsx","INVALID",12,0,"baba");// its used to write data in excel sheet
	
		}

	}

}
