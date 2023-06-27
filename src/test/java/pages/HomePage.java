package pages;

import org.openqa.selenium.By;

import base.Base;

public class HomePage extends Base {


 
	// Locator for login button
	public static By empLoginBtn = By.xpath("//a[@href='elogin.php']");
	public static By custLoginBtn = By.xpath("//a[@href='clogin.php']");


	public static void clickEmpLogin() {
	click(empLoginBtn);
	}


	public static void clickCustLogin() {
		click(custLoginBtn);


	}

}
