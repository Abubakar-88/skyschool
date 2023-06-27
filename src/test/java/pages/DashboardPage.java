package pages;

import base.Base;
import org.openqa.selenium.By;

public class DashboardPage extends Base {
	


	// Locators for the page title and the logout button
	
public static	By heading = By.xpath("//h2[text()='Welcome Test ']");
 public static	By logoutBtn = By.xpath("//a[@href='elogin.php']");

	// Method to capture the page heading
	public static String getHeading() {
		String head = driver.findElement( heading  ).getText();
		return head;
	}

	// Method to click on Logout button
	public  static void clickLogout() {
		click(logoutBtn);

	}
	
}
