package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class EmpLoginPage extends Base {

	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public EmpLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator for username field
	By uName = By.name("mailuid");

	// Locator for password field
	By pswd = By.name("pwd");

	// Locator for login button
	By loginBtn = By.name("login-submit");

	// Method to enter username
	public void enterUsername(String user) {
		sendKeys(uName, user);
		// driver.findElement(uName).sendKeys(user);
	}

	// Method to enter password
	public void enterPassword(String pass) {
		sendKeys(pswd, pass);
		// driver.findElement(pswd).sendKeys(pass);
	}

	// Method to click on Login button
	public void clickLogin() {
		click(loginBtn);
		//driver.findElement(loginBtn).click();
	}
	

	
}