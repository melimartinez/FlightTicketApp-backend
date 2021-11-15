package com.revature.steps;

import com.revature.pages.SpaceMain;
import com.revature.runner.SpaceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class VendorAddDestStepImpl {
	//Will have methods to be executed that corresponds to the Scenario steps
	
	public static SpaceMain spaceMain = SpaceRunner.spaceMain;
	public static WebDriver driver = SpaceRunner.driver;
	
	//Category 2 - Run after implementation
	@Given("Vendor is on the Vendor Landing Page")
	public void vendor_is_on_the_vendor_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:4200/vendorHome");
		driver.manage().window().fullscreen();
	}
	@When("Vendor clicks on Add SpacePorts navbar link")
	public void vendor_clicks_on_add_space_ports_navbar_link() {
		// Write code here that turns the phrase above into concrete actions
		spaceMain.createDestinationButton.click();
	}
	@Then("Vendor should be able to fill out form to add spaceports and clicks on submit")
	public void vendor_should_be_able_to_fill_out_form_to_add_spaceports_and_clicks_on_submit() {
		// Write code here that turns the phrase above into concrete actions

		spaceMain.spName.sendKeys("Dorothea");
		spaceMain.planet.sendKeys("Uranus");

		spaceMain.submitDestinationButton.click();
	}
	@Then("Vendor get submited successfully message")
	public void vendor_get_submited_successfully_message() {
		// Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String expected = "http://localhost:4200/vendorHome";
		Assert.assertEquals(expected, driver.getCurrentUrl());
	}

}
