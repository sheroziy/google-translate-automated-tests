package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class GoogleTranslatePage {
	
	private WebDriver driver;

	public GoogleTranslatePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="source")
	public WebElement inputBox;
	
	@FindBy(id="gt-res-dir-ctr")
	public WebElement outputBox;
	
	@FindBy(id="gt-tl-gms")
	public WebElement languageOpt;
	
	

}
