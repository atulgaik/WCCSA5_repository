package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends Basttest implements IautoConstant
{
	public static void main(String[] args) throws IOException, InterruptedException {
		Basttest b = new Basttest();
		b.openBrowser();
		
		Flib f = new Flib();
		driver.findElement(By.name("username")).sendKeys(f.readPropertyData(PROP_PATH,"Username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(f.readPropertyData(PROP_PATH,"Passward"));
		driver.findElement(By.id("loginButton")).click();
	}
	
}


	
