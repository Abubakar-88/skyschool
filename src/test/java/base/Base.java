package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Base {
	protected static WebDriver driver;
	protected static Properties property = new Properties();
	protected static FileInputStream fis;
	protected static utilities.ExcelReader reader;
	
	public static void click(By by) {
		driver.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){

		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}

	public static void submit(By by){
		driver.findElement(by).submit();
	}
	protected static void navigateURL(String url) {
		driver.get( url );
	}

}
