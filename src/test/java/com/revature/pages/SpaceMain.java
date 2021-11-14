package com.revature.pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpaceMain {
	
	public WebDriver driver;
	
	@FindBy(css = "")
	public WebElement bookedFlights;
	
	@FindBy(css = "")
    	public WebElement revenue;

   	@FindBy(id = "")
    	public WebElement addDest;

	@FindBy(id = "userInput")
	public WebElement usernameInput;
	@FindBy (id = "passwordInput")
	public WebElement passwordInput;
	@FindBy(xpath = "/html/body/app-root/div/div/app-login/div/div[3]")
	public WebElement loginButton;
	@FindBy(id = "departureSpaceport")
	public WebElement headerCustomerHome;



	//Vendor create flights form elements
	@FindBy(id = "departureDateTimeInput")
	public WebElement departureDateTime;

	@FindBy(id="arrivalDateTimeInput")
	public WebElement arrivalDateTime;

	@FindBy(id = "priceInput")
	public WebElement pricePerTicket;

	@FindBy(id = "costInput")
	public WebElement flightCost;

	@FindBy(xpath = "/html/body/app-root/div/div/app-vendor-create-flights/div[5]/select")
	public WebElement departureSpaceport;

	@FindBy(xpath = "/html/body/app-root/div/div/app-vendor-create-flights/div[6]/select")
	public WebElement arrivalSpaceport;

	@FindBy(xpath = "/html/body/app-root/div/div/app-vendor-create-flights/div[7]/select")
	public WebElement spaceship;

	@FindBy(xpath = "/html/body/app-root/div/div/app-vendor-create-flights/div[8]/button[1]")
	public WebElement createFlightButton;

	// Vendor Home buttons
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorhome/div[3]/div/table/tbody/tr/div/button")
	public WebElement viewFlightButton;




	public SpaceMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
