package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class HomePage extends Base {


	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
 
	// Locator for login button
	By empLoginBtn = By.xpath("//a[@href='elogin.php']");
	By custLoginBtn = By.xpath("//a[@href='clogin.php']");


	public void clickEmpLogin() {
	click(empLoginBtn);
	}


	public void clickCustLogin() {
		click(custLoginBtn);

	}

}
