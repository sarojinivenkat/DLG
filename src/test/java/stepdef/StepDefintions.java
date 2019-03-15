package stepdef;

import org.openqa.selenium.WebDriver;

import base.BaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Configuration;
import pages.LoginPage;


public class StepDefintions {

	WebDriver driver;
	
	@Before
	public void initiate(){
		
		String browserName = Configuration.getBrowserName();
		BaseTest baseTest = new BaseTest();
		driver = baseTest.getDriver(browserName);
		}
	
	@After()
	public void cleanup(){
		//driver.quit();
	}
	

	@Given("^user open insurance portal website$")
	public void user_open_insurance_portal_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(Configuration.getURL());

	}

	@When("^user navigates to insuranc portal page$")
	public void user_navigates_to_insuranc_portal_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is in website");
	    
	}

	@When("^enter registration number as \"([^\"]*)\"$")
	public void enter_registration_number_as(String regNum) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage login = new LoginPage(driver);
		login.enterRegistrationNumber(regNum);
		login.searchVehicleRegNum();
	   
	}

	@Then("^user should see vehicle insurance cover start and end date and the status is \"([^\"]*)\"$")
	public void user_should_see_vehicle_insurance_cover_start_and_end_date_and_the_status_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("valid register number user is bale to see insurance start and expiry date");
	    
}
}
