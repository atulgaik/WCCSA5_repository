package JSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor 
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(1500,-1000)");
			 
			 js.executeScript("window.scrollBy(1500,0)");
			 
			
			
			

	}

}
