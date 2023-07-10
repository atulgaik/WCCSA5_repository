package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {

	public static void main(String[] args) throws IOException 
	{
		//by using EventFiringWebdriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.selenium.dev");
			EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
			
			
			File scr = ewf.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/selenium2.png");

			Files.copy(scr, dest);


		

	}

	
	}

