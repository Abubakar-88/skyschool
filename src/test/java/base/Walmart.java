package base;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Walmart {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://www.keyfood.com");

		
		WebElement searchBox = driver.findElement(By.id("js-site-search-input"));
		searchBox.sendKeys("Butter" + Keys.ENTER);
		
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='product__listing product__list ']/div"));
		
		for (WebElement  item : items) {
			String itemName = item.findElement(By.xpath(".//div[@class='product__list--name js-key-product-detail']")).getText();
			System.out.println(itemName);
		}
		
		//amazon -> camera          print all the items name
		//target -> laptop          print all the prices
		//costco -> watch           print all the items description
		
		

	}

}
