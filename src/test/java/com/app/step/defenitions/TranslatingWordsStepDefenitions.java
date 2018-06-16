package com.app.step.defenitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.GoogleTranslatePage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TranslatingWordsStepDefenitions {
	GoogleTranslatePage page = new GoogleTranslatePage();
	
	
	
	@Given("^I'm on Google translate page$")
	public void i_m_on_Google_translate_page() {
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    BrowserUtils.waitForPageToLoad(10);
	    
	}

	@When("^I type words$")
	public void i_type_words() throws InterruptedException {
		BrowserUtils.waitForVisibility(page.inputBox, 5);
	    page.inputBox.sendKeys("Car");
	    new Actions(Driver.getDriver()).click(page.languageOpt).perform();
	    Thread.sleep(2000);
	   
	    Driver.getDriver().findElement(By.xpath("(//div[.='Russian'])[1]")).click();

		
	}

	@Then("^I should see translated words$")
	public void i_should_see_translated_words() {
	    
	}
}
