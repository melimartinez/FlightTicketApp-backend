package com.revature.runner;

import com.revature.pages.SpaceMain;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// import cucumber.api.CucumberOptions;

//This class is responsible for Running the tests by pulling in the feature files and step implementations
//executing them appropriately

// "src/test/resources/login.feature"

// CUST_REG_1.feature
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/CUST_BOOK_3.feature", glue = {"com.revature.steps"})
public class SpaceRunner {
	
	public static WebDriver driver; 
	public static SpaceMain spaceMain; 
	
	@BeforeClass
	public static void setUp() {
		String path = "C:/Users/mandm/OneDrive/Desktop/Selenium/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		spaceMain = new SpaceMain(driver);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	
}
