package com.revature.steps;

import com.revature.pages.SpaceMain;
import com.revature.runner.SpaceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CustRegStep {

	public static SpaceMain spaceMain = SpaceRunner.spaceMain;
	public static WebDriver driver = SpaceRunner.driver;


	@Given("^Customer is on Guest Home Page$")
	public void customer_is_on_Guest_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get("http://localhost:4200");
	  driver.manage().window().fullscreen();

	}

	@When("^Customer clicks on Customer Register button$")
	public void customer_clicks_on_Customer_Register_button(){
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		spaceMain.customerRegistration.click();

	}

	@Then("^Customer should be on Customer Registration Page$")
	public void customer_should_be_on_Customer_Registration_Page() {
	    // Write code here that turns the phrase above into concrete actions

		String expected = "http://localhost:4200/register";
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}

	@Then("^Customer enters valid inputs on all required fields$")
	public void customer_enters_valid_inputs_on_all_required_fields() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		spaceMain.firstNameInput.sendKeys("Ellen");
		spaceMain.lastNameInput.sendKeys("Ripley");
		spaceMain.dobInput.sendKeys("01-07-2092");
		spaceMain.emailInput.sendKeys("Newt@TheCompany.com");
		spaceMain.UsernameRInput.sendKeys("Jonesy");
		spaceMain.cRegisterPasswordInput.sendKeys("Here");
		spaceMain.address1Input.sendKeys("123 Nostromo St.");
		spaceMain.address2Input.sendKeys("I may be in hyper sleep");
		spaceMain.cityInput.sendKeys("Hadley's Hope");
		spaceMain.state1.click();
		spaceMain.state1.sendKeys(Keys.DOWN);
		spaceMain.state1.sendKeys(Keys.ENTER);
		spaceMain.zipcodeInput.sendKeys("12345");
		spaceMain.phoneInput.sendKeys("9999999999");
	}

	@Then("^Customer clicks on Register button$")
	public void customer_clicks_on_Register_button() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions

		spaceMain.cRegistrationButton.click();
		spaceMain.cRegistrationButton.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Alert alert = driver.switchTo().alert();
		alert.accept();
	  
	}

	@Then("^Customer is on the Login Page$")
	public void customer_is_on_the_Login_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String expected = "http://localhost:4200/login";
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}
}
