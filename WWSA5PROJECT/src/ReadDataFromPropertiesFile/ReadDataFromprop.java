package ReadDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromprop {

	public static void main(String[] args) throws IOException {
		//read data from config.properties file
		
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		Properties prop = new Properties();// properties is java class
		prop.load(fis);//used to load a file
		//read the particular property file from file
		
		String data = prop.getProperty("Url");
		System.out.println(data);
		

	}

}
