package com.revature.steps;
import com.revature.pages.SpaceMain;
import com.revature.runner.SpaceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CustBookStep {

	public static SpaceMain spaceMain = SpaceRunner.spaceMain;
	public static WebDriver driver = SpaceRunner.driver;
	
	@Given("^Customer is on Customer Home Page$")
	public void customer_is_on_Customer_Home_Page()  {
		driver.get("http://localhost:4200/customerHome");
		driver.manage().window().fullscreen();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^Customer can view flights and click on Book button$")
	public void customer_can_view_flights_and_click_on_Book_button()  {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		spaceMain.book2.click();
	  
	}

	@Then("^Customer should be on Ticket Page$")
	public void customer_should_be_on_Ticket_Page() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String headingExpected = "Book Your Ticket";
		String headingActual = spaceMain.headingBook.getText();
		Assert.assertEquals(headingExpected, headingActual);

	}
	  

	@Then("^Customer fills in required information$")
	public void customer_fills_in_required_information() {

		spaceMain.passportNo.sendKeys("123456789");
		spaceMain.meals.click();
		spaceMain.meals.sendKeys(Keys.DOWN);
		spaceMain.meals.sendKeys(Keys.ENTER);
		spaceMain.cabinClass.click();
		spaceMain.cabinClass.sendKeys(Keys.DOWN);
		spaceMain.cabinClass.sendKeys(Keys.ENTER);
		spaceMain.expiryDate.sendKeys("07/18/2035");
		spaceMain.noOfPassengers.sendKeys("1");
		spaceMain.checkedBag.sendKeys("1");
		spaceMain.carryOnBag.sendKeys("2");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   
	}

	@Then("^Customer click on Book Ticket button$")
	public void customer_click_on_Book_Ticket_button()  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		spaceMain.bookTicket.click();
	  
	}

	@Then("^Customer should be on Confirmed Page$")
	public void customer_should_be_on_Confirmed_Page() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String expected = "http://localhost:4200/confirmed";
		org.junit.Assert.assertEquals(expected, driver.getCurrentUrl());
	    
	}
}



	
	