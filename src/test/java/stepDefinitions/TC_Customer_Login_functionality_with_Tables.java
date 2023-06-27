package stepDefinitions;


import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import pages.DashboardPage;
import pages.HomePage;
import pages.CustLoginPage;
import utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TC_Customer_Login_functionality_with_Tables extends Base {


	@When("I navigate to microtech site")
	public void i_navigate_to_microtech_site() {
		driver.get("https://it.microtechlimited.com/elogin.php");
	}

	@Then("I click on Login Button")
	public void i_click_on_Login_Button() {

		click(HomePage.custLoginBtn);

	}


	@Then("I enter User Id and Password from sheetname {string} and rownumber {int}")
	public void i_enter_User_Id_and_Password_from_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		reader = new ExcelReader();
		List<Map<String,String>> testData =
				reader.getData(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\loginData.xlsx", sheetName);
		String userId = testData.get(rowNumber).get("UserId");
		String password = testData.get(rowNumber).get("password");
		CustLoginPage.enterUsername(userId);
		CustLoginPage.enterPassword(password);
	}


	@Then("Click on Login Button")
	public void click_on_Login_Button() throws InterruptedException {
		// Click on login button
		CustLoginPage.clickLogin();
		Thread.sleep(2000);
	}

	@Then("the Home Page will appear")
	public void the_Home_Page_will_appear() throws InterruptedException {
		assertEquals("Welcome Test", DashboardPage.getHeading());
		// Click on Logout button
		DashboardPage.clickLogout();
	}



}
