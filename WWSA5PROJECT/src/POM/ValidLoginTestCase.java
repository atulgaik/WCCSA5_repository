package POM;

import java.io.IOException;

public class ValidLoginTestCase extends Basttest{
	public static void main(String[] args) throws IOException {
		Basttest b = new Basttest();
		b.openBrowser();
		
		Flib f = new Flib();
		//to call the webelement of login page create object of it
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(f.readPropertyData(PROP_PATH,"Username"),f.readPropertyData(PROP_PATH, "Passward"));
		
	}

}
