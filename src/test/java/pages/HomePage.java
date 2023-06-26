package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base {


	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
