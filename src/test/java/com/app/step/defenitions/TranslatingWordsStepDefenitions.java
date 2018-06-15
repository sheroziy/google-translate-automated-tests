package com.app.step.defenitions;

import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TranslatingWordsStepDefenitions {

	
	//new comment new comment
	
	@Given("^I'm on Google translate page$")
	public void i_m_on_Google_translate_page() {
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    BrowserUtils.waitForPageToLoad(10);
	    
	}

	@When("^I type words$")
	public void i_type_words() {
	    //adding cooments in to alpha
	}

	@Then("^I should see translated words$")
	public void i_should_see_translated_words() {
	    
	}
}
