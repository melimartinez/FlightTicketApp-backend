package com.revature.steps;

import com.revature.pages.SpaceMain;
import com.revature.runner.SpaceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class VendorDeleteFlight {

    public static SpaceMain spaceMain = SpaceRunner.spaceMain;
    public static WebDriver driver = SpaceRunner.driver;
    //JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("A Vendor is logged in and on the home page")
    public void a_vendor_is_logged_in_and_on_the_home_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://localhost:4200/login");
        driver.manage().window().fullscreen();
        spaceMain.usernameInput.sendKeys("ir");
        spaceMain.passwordInput.sendKeys("1234567");
        spaceMain.loginButton.click();
        Thread.sleep(500);
    }


    @Given("clicked view flight")
    public void clicked_view_flight() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);



        spaceMain.viewFlightsButton.click();
        Thread.sleep(300);
    }
    @When("The Vendor clicks on Edit flight and changes elements")
    public void the_vendor_clicks_on_edit_flight_and_changes_elements() {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        spaceMain.EditFlightButton.click();
        spaceMain.selectDepartureSpacePort.click();
        spaceMain.departureSpacePortDrop.click();
        spaceMain.selectArrivalSpacePort.click();
        spaceMain.arrivalSpacePortDrop.click();
        spaceMain.vendorSpaceshipSelect.click();
        spaceMain.getVendorSpaceshipDrop.click();
    }
    @When("clicks submit")
    public void clicks_submit() {
        // Write code here that turns the phrase above into concrete actions
        spaceMain.vendorSubmitEdit.click();

    }
    @Then("The Vendor will be taken to VendorHome to view changes")
    public void the_vendor_will_be_taken_to_vendor_home_to_view_changes() {
        // Write code here that turns the phrase above into concrete actions
        String expected = "http://localhost:4200/vendorHome";
        Assert.assertEquals(expected, driver.getCurrentUrl());
    }


    @When("clicks on delete Flight")
    public void clicks_on_delete_flight() {
        // Write code here that turns the phrase above into concrete actions

       // wikiMain.vendorDeleteFlight.click();

        spaceMain.vendorDeleteFlight.click();
    }
    @Then("The flight will be cancelled and removed from all flights")
    public void the_flight_will_be_cancelled_and_removed_from_all_flights() {
        // Write code here that turns the phrase above into concrete actions
        String expected = "http://localhost:4200/vendorHome";
        Assert.assertEquals(expected, driver.getCurrentUrl());
    }

}
