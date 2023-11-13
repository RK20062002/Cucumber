package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.base.fbRegister_pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Strict method && Data Table ------>>> without header ---->>> 1D,2D Lists

public class fbRegistration extends BaseClass{
	
	fbRegister_pojo f;
	
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of fb application")
	public void to_launch_the_url_of_fb_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
	   Thread.sleep(3000);
	   f = new fbRegister_pojo();
	   clickBtn(f.getCreateNewAccount());
	}

	@When("To pass firstname in firstname txt box")
	public void to_pass_firstname_in_firstname_txt_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);

		Map<String,String> m = d.asMap(String.class, String.class);
		
//		List<String> l = d.asList();   	------------------>>>>> 1D list data)
		f= new fbRegister_pojo();
		passText(m.get("firstname2"), f.getFirstName());
	}

	@When("To pass secondname in secondname txt box")
	public void to_pass_secondname_in_secondname_txt_box() {
		f = new fbRegister_pojo();
		passText("Kumar", f.getSecondName());
	}

	@When("To pass mobileno or email in email txt box")
	public void to_pass_mobileno_or_email_in_email_txt_box(DataTable d) {

//		List<List<String>> l = d.asLists();		--------------->>>> 2D list data
		List<Map<String, String>> m = d.asMaps();
		f = new fbRegister_pojo();
		passText(m.get(1).get("password2") ,f.getMobileOrEmail());
	}

	@When("To create new password in new password txt box")
	public void to_create_new_password_in_new_password_txt_box() {
	    passText("rk20062002", f.getNewPassword());
	}

	@Then("To close the edge browser")
	public void to_close_the_edge_browser() {
	   //closeEntireBrowser();
	}


}
