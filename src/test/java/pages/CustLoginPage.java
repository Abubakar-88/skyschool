package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;

public class CustLoginPage extends Base {

	public CustLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator for username field
	By uName = By.name("mailuid");

	// Locator for password field
	By pswd = By.name("pwd");

	// Locator for login button
	By loginBtn = By.name("login-submit");

	//Error Label
	By errorLabel = By.id("error-msg");
	public  WebElement element;


	public void enterUsername(String user) {
		sendKeys(uName, user);

	}

	// Method to enter password
	public void enterPassword(String pass) {
		sendKeys(pswd, pass);

	}

	// Method to click on Login button
	public void clickLogin() {
		click(loginBtn);

	}
	
	public String getErrorMessage() {
		return getText(errorLabel);

	}

	
}