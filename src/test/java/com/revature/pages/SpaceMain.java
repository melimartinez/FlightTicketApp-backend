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

	
	public SpaceMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}