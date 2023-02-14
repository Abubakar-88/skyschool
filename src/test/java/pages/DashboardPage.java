package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class DashboardPage extends Base {
	
	WebDriver driver;
	
	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for the page title and the logout button
	
	By heading = By.xpath("//h2[text()='Welcome Test ']");
	By logoutBtn = By.xpath("//a[@href='elogin.php']");

	// Method to capture the page heading
	public String getHeading() {
		String head = driver.findElement( heading  ).getText();
		return head;
	}

	// Method to click on Logout button
	public void clickLogout() {
		click(logoutBtn);
		//driver.findElement(logoutBtn).click();
	}
	
}
