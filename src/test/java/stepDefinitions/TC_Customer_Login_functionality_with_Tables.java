package stepDefinitions;


import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.CustLoginPage;

public class TC_Customer_Login_functionality_with_Tables extends Base {

	// Creating object of home page
	HomePage home = new HomePage(driver);
	// Creating object of Login page
	CustLoginPage login = new CustLoginPage(driver);
	// Creating object of DashboardPage

	
	
	@When("I navigate to microtech site")
	public void i_navigate_to_microtech_site() {
		navigateURL("https://it.microtechlimited.com/");
	}
	@Then("I click on Login Button")
	public void i_click_on_Login_Button() {
		home.clickEmpLogin();
		
	}

	@Then("I enter user Id as  {string}")
	public void i_enter_user_Id_as(String userId) {
	
		login.enterUsername(userId);
	}

	@Then("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    login.enterPassword(password);
	}

	@Then("Click on Customer Login Button")
	public void click_on_Customer_Login_Button() {
	    login.clickLogin();
	}



}
