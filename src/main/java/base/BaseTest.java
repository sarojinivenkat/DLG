
package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import helper.Configuration;

public class BaseTest {
	
	WebDriver driver;
	Configuration con;
	String browserName = con.getBrowserName();
	public WebDriver getDriver(String browserName){
	
	
		switch(browserName){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "binaries1/chromedriver.exe");
			ChromeOptions cOptions = new ChromeOptions();
			Map<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_setting_values.notifications", 2);
			chromePrefs.put("credentials_enable_service", false);
			cOptions.setExperimentalOption("prefs", chromePrefs);
			cOptions.addArguments("disable-infobars");
			driver = new ChromeDriver(cOptions);
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "binaries1/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please provide correct browser name");
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		
		return driver;
	}
}
