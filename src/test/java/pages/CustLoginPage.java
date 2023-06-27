package pages;

import org.openqa.selenium.By;

import base.Base;

public  class CustLoginPage extends Base {


	// Locator for username field
	public static By uName = By.name("mailuid");

	// Locator for password field
   public static By pswd = By.name("pwd");

	// Locator for login button
   public static By loginBtn = By.name("login-submit");

	//Error Label
  public static By errorLabel = By.id("error-msg");



	public static void enterUsername(String user) {
		sendKeys(uName, user);

	}

	// Method to enter password
	public static void enterPassword(String pass) {
		sendKeys(pswd, pass);

	}

	// Method to click on Login button
	public static void clickLogin() {
		click(loginBtn);

	}
	
	public static String getErrorMessage() {
		return getText(errorLabel);

	}

	
}