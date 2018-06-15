package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.app.utilities.Driver;

public class GoogleTranslatePage {
	WebDriver driver = Driver.getDriver();
	
	@FindBy(id="source")
	public WebElement inputBox;
	
	@FindBy(id="gt-res-dir-ctr")
	public WebElement compare;

}
