package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.HomePage;
import pages.EmpLoginPage;
import utilities.ExcelReader;

public class TC_Login_Functionality_With_positive_and_negative_scenarios extends Base {
	// Creating object of home page
	HomePage home = new HomePage(driver);
	// Creating object of Login page
	EmpLoginPage login = new EmpLoginPage(driver);
	// Creating object of DashboardPage
	DashboardPage dashboard = new DashboardPage(driver);
	
	@Given("I am in Chrome Browser")
	public void i_am_in_Chrome_Browser() {
	    //driver.
	}
	
	
	@When("I navigate to microtech site")
	public void i_navigate_to_microtech_site() {
		driver.get(property.getProperty("baseUrl"));
	}

	@Then("Landing Page will appear")
	public void landing_Page_will_appear() {
	    
	}

	@Then("I click on Login Button")
	public void i_click_on_Login_Button() {
		// Click on Login button
		home.clickEmpLogin();
		
	}
	

	@Then("I enter User Id and Password from sheetname {string} and rownumber {int}")
	public void i_enter_User_Id_and_Password_from_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\loginData.xlsx", sheetName);
		String userId = testData.get(rowNumber).get("UserId");
		String password = testData.get(rowNumber).get("password"); 
		login.enterUsername(userId);
		login.enterPassword(password);
	}
	
	
	@Then("Click on Login Button")
	public void click_on_Login_Button() throws InterruptedException {
		// Click on login button
		login.clickLogin();
		Thread.sleep(5000); // NEED TO REMOVE
	}

	@Then("the Home Page will appear")
	public void the_Home_Page_will_appear() throws InterruptedException {
		assertEquals("Welcome Test", dashboard.getHeading());
		// Click on Logout button
		dashboard.clickLogout();
	}


}
