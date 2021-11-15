package com.revature.steps;

import com.revature.pages.SpaceMain;
import com.revature.runner.SpaceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepImpl {

    public static SpaceMain wikiMain = SpaceRunner.spaceMain;
    public static WebDriver driver = SpaceRunner.driver;

    @Given("The User is on the Login Page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://localhost:4200/login");
        driver.manage().window().fullscreen();
    }
    @When("The Customer enters a correct {string} and {string} and presses Login")
    public void the_customer_enters_a_correct_and_and_presses_login(String string, String string2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wikiMain.usernameInput.sendKeys(string);
        wikiMain.passwordInput.sendKeys(string2);
        wikiMain.loginButton.click();
        Thread.sleep(500);



    }
    @Then("The Customer should land on the Customer home page")
    public void the_customer_should_land_on_the_customer_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String expected = "http://localhost:4200/customerHome";
        Assert.assertEquals(expected, driver.getCurrentUrl());

    }

    @When("The Vendor enters their correct {string} and {string} and presses Login")
    public void the_vendor_enters_their_correct_and_and_presses_login(String string, String string2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        wikiMain.usernameInput.sendKeys(string);
        wikiMain.passwordInput.sendKeys(string2);
        wikiMain.loginButton.click();
        Thread.sleep(500);


    }
    @Then("The vendor will be on the landing page")
    public void the_vendor_will_be_on_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        String expected = "http://localhost:4200/vendorHome";
        Assert.assertEquals(expected, driver.getCurrentUrl());

    }


    }
