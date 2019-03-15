package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
	
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	
	
	
	private By vehicle_regno = By.id("vehicleReg");
	private By search_button = By.name("btnfind");
	
	public void enterRegistrationNumber(String regNum){
		sendText(vehicle_regno, regNum);
	}

	public void searchVehicleRegNum() {
		clickOn(search_button);
	}
}
