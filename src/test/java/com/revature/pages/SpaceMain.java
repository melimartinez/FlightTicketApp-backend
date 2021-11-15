package com.revature.pages;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpaceMain {
	
	public WebDriver driver;
	
	//=====================================Customer Home Elements================================
	
//		@FindBy(id = "departureSpaceport")         ---- uncomment when running CUST_FILTERED_BOOK_4.feature
//		public WebElement departureSpaceport;
//		
//		@FindBy(id = "arrivalSpaceport")           ---- uncomment when running CUST_FILTERED_BOOK_4.feature
//	    public WebElement arrivalSpaceport;

	    @FindBy(id = "departureDate")
	    public WebElement departureDate;
	    
	    @FindBy(id = "arrivalDate")
	    public WebElement arrivalDate;
	    
	    @FindBy(id = "search")
	    public WebElement search;
	    
	    @FindBy(id = "book1")
	    public WebElement book1;
	    
	    @FindBy(id = "filtered")
	    public WebElement filtered;

		@FindBy(name = "book")
		public WebElement book2;
	    
	    
	    //========================================Ticket Form Elements=================================
	    
	    @FindBy(id = "passportNo")
		public WebElement passportNo;
		
		@FindBy(id = "meals")
	    public WebElement meals;

	    @FindBy(id = "cabinClass")
	    public WebElement cabinClass;
	    
	    @FindBy(id = "expiryDate")
	    public WebElement expiryDate;
	    
	    @FindBy(id = "noOfPassengers")
	    public WebElement noOfPassengers;
	    
	    @FindBy(id = "checkedBag")
	    public WebElement checkedBag;
	    
	    @FindBy(id = "carryOnBag")
	    public WebElement carryOnBag;
	    
	    @FindBy(id = "bookTicket")
	    public WebElement bookTicket;
	    
	    @FindBy(id = "headingBook")
	    public WebElement headingBook;
	
	
	//Login Elements
	@FindBy(id = "userInput")
	public WebElement usernameInput;
	@FindBy (id = "passwordInput")
	public WebElement passwordInput;
	@FindBy(xpath = "/html/body/app-root/div/div/app-login/div/div[3]")
	public WebElement loginButton;
	@FindBy(id = "departureSpaceport")
	public WebElement headerCustomerHome;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorhome/div[3]/div/table/tbody/tr[1]/div/button")
	public WebElement viewFlightsButton;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[10]/button[1]")
	public WebElement EditFlightButton;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[7]/select")
	public WebElement selectDepartureSpacePort;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[7]/select/option[1]")
	public WebElement departureSpacePortDrop;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[8]/select")
	public WebElement selectArrivalSpacePort;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[8]/select/option[2]")
	public WebElement arrivalSpacePortDrop;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[9]/select")
	public WebElement vendorSpaceshipSelect;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[9]/select/option[1]")
	public WebElement getVendorSpaceshipDrop;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[10]/button[1]")
	public WebElement vendorSubmitEdit;
	@FindBy(xpath = "/html/body/app-root/div/div/app-vendorflightview/div[10]/button[2]")
	public WebElement vendorDeleteFlight;

	@FindBy(xpath = "/html/body/app-root/div/div/ul/li[2]")
	public WebElement customerRegistration;
	@FindBy(id = "firstNameInput")
	public WebElement firstNameInput;
	@FindBy(id = "lastNameInput")
	public WebElement lastNameInput;
	@FindBy(id = "dobInput")
	public WebElement dobInput;
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	@FindBy(id = "usernameRInput")
	public WebElement UsernameRInput;
	@FindBy(id = "passwordInput")
	public WebElement cRegisterPasswordInput;
	@FindBy(id = "address1Input")
	public WebElement address1Input;
	@FindBy(id = "address2Input")
	public WebElement address2Input;
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	@FindBy(xpath = "/html/body/app-root/div/div/app-register/div[6]/div[2]/select")
	public WebElement state1;
	@FindBy(id = "zipcodeInput")
	public WebElement zipcodeInput;
	@FindBy(id = "phoneInput")
	public WebElement phoneInput;
	@FindBy(xpath = "/html/body/app-root/div/div/app-register/div[7]/div/button")
	public WebElement cRegistrationButton;

	@FindBy(xpath ="/html/body/app-root/div/div/app-guest/div/div[4]/div[1]/div/div/button")
	public WebElement bookButton;


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

	@FindBy(id = "createDestinationButton")
	public WebElement createDestinationButton;

	// Vendor Create Destination
	@FindBy(id = "spNameInput")
	public WebElement spName;

	@FindBy(id = "planetInput")
	public WebElement planet;

	@FindBy(id = "submitDestination")
	public WebElement submitDestinationButton;

	@FindBy(id = "successfulDestination")
	public WebElement successfulDestinationMessage;



	public SpaceMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
