import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticular
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.selenium.dev");
			 WebElement newselement =driver.findElement(By.xpath("//h2[text()='News']"));
			 Point loc = newselement.getLocation();
			 loc.getX();
			 loc.getY();
			 
			  JavascriptExecutor jse =(JavascriptExecutor)driver;
			  
			  jse.executeScript("Windows.scrollby");
			
			
	}
}
