package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	
	
	
	@FindBy(xpath="//a[@href='elogin.php']")
	WebElement Vname;
		
	// Method to click login button
	public void clickEmpLogin() {
		
		try {
		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(Vname));  
		element.click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex) {
			WebElement element = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(Vname));  
			element.click();
		}
	}

	
//	try {
//	    WebElement element = (new WebDriverWait(driver, 10))
//	.until(ExpectedConditions.elementToBeClickable(Vname));  
//element.click();
//	}
//	catch(org.openqa.selenium.StaleElementReferenceException ex)
//	{
//	  WebElement element = (new WebDriverWait(driver, 10))
//	.until(ExpectedConditions.elementToBeClickable(Vname));  
//element.click();
//	}
	// Method to click login button
	
	public void clickCustLogin() {
		click(custLoginBtn);

	}
}
