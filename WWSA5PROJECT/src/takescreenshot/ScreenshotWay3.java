package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver cdriver = new EdgeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		cdriver.get("https://www.selenium.dev");

		File scr = cdriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/selenium.png");

		Files.copy(scr, dest);

	}

}
