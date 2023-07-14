package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

{
	//web element repository
	
	@FindBy(name="username") private WebElement usnTB;
	
	
	@FindBy(name="pwd") private WebElement pssTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(id="partialLinkText=Actmind Inc.") private WebElement actiLink;
	
	//intialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getActiLink() {
		return actiLink;
	}
	//operational Method
	 public void validLoginMethod(String validUsername,String validPassword)
		{
			usnTB.sendKeys(validUsername);
			pssTB.sendKeys(validPassword);
			loginButton.click();
		}
	 public void inValidLoginMethod(String invalidUsername,String invalidPassword) throws InterruptedException
		{
			usnTB.sendKeys(invalidUsername);
			pssTB.sendKeys(invalidPassword);
			loginButton.click();
			Thread.sleep(1000);
			usnTB.clear();
		}
	
	
	
	
	
	
	
}


