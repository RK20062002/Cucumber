package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class Icic_bank extends BaseClass{
	
	@Before
	public void launch() {
		launchBrowser();
		windowMaximize();
	}
	
	@When("To launch the icic bank url")
	public void to_launch_the_icic_bank_url() {
	    launchUrl("https://www.icicibank.com/");
	}
	
	@When("To click the button")
	public void to_click_the_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.id("loginsection"));
		btn.click();
		
//		WebElement personal = driver.findElement(By.xpath("//a[@class='Personal']"));
//		personal.click();
	}

	@When("To pass userid in userid field")
	public void to_pass_userid_in_userid_field() throws InterruptedException {
		Thread.sleep(3000);
	   WebElement email = driver.findElement(By.xpath("//input[@title='User Id']"));
	   email.click();
	   email.sendKeys("abc@gmail.com");
	}
	
	@When("To pass pin in password field")
	public void to_pass_pin_in_password_field() {
	    WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
	    password.sendKeys("1234567890");
	}

	@When("To hit the login button")
	public void to_hit_the_login_button() {
	    WebElement loginbtn = driver.findElement(By.xpath("//input[@type='Submit']"));
	    loginbtn.click();
	}

	@When("User has lauch the icic bank url")
	public void user_has_lauch_the_icic_bank_url() {
	   
	}
	
	@When("User has hit the login button")
	public void user_has_hit_the_login_button() {
		
	}

	@When("User to pass the date{string} in userid field")
	public void user_to_pass_the_date_in_userid_field(String string) {
	    
	}

	@When("User to pass the data{string} in password field")
	public void user_to_pass_the_data_in_password_field(String string) {
	   
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	    
	}
	
	@After
	public void close() {
		closeEntireBrowser();

	}


}
