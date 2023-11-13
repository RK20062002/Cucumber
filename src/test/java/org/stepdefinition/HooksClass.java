package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksClass extends BaseClass{
	
	@Before
	// Set Precondition
	private void precondition() {
		launchBrowser();
		windowMaximize();
	}
	
	@Given("To launch the edge browser and maximize window")
	public void to_launch_the_edge_browser_and_maximize_window() {
	    
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	    
	}

	@When("User has to pass the data{string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String string) {
	    
	}

	@When("User has to pass the data{string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String string) {
	    
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	   
	}

	
	@After
	// Set Postcondition
	private void postcondition() {
		closeEntireBrowser();
	}
}
