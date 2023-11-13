package org.stepdefinition;

import org.base.BaseClass;
import org.base.fblogin_pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbLogin extends BaseClass{
	
	fblogin_pojo f;
	
	@Given("To launch the browser")
	public void to_launch_the_browser() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("The url is launch")
	public void the_url_is_launch() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To pass email in email field")
	public void to_pass_email_in_email_field() {
	    f = new fblogin_pojo();
	    passText("rk@gmail.com", f.getEmail());
	}

	@When("To pass password in password field")
	public void to_pass_password_in_password_field() {
	   f = new fblogin_pojo();
	   passText("9715435855", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    f = new fblogin_pojo();
	    clickBtn(f.getLoginbtn());
	}

	@Then("close the browser")
	public void close_the_browser() {
	    closeEntireBrowser();
	}

}
