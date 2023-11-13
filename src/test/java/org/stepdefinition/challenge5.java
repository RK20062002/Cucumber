package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class challenge5 extends BaseClass{
	
	@Before(order = 2)
	public void launch() {
		launchBrowser();
		windowMaximize();
	}
	
	@When("To launch url of flipkart")
	public void to_launch_url_of_flipkart() {
	   launchUrl("https://www.flipkart.com/");
	}

	@When("To search from the searchbar")
	public void to_search_from_the_searchbar() throws InterruptedException {
		Thread.sleep(3000);
	    WebElement searchbar = driver.findElement(By.name("q"));
	    searchbar.sendKeys("phone");
	    
	    WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
	    enter.click();
	}

	@When("To take screenshot")
	public void to_take_screenshot() throws IOException, InterruptedException {
		Thread.sleep(3000);
		screenShot("phone.png");
	    
	}

	@When("User launch the url")
	public void user_launch_the_url() {
	    launchUrl("https://www.flipkart.com/");
	}

	@When("User search product{string} in searchbar")
	public void user_search_product_in_searchbar(String pro) throws InterruptedException {
		  Thread.sleep(3000);
		  WebElement searchbar = driver.findElement(By.name("q"));
		  passText(pro, searchbar);
		  
		  WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
		  enter.click();
		  
	}

	@When("User takes screenshot{string}")
	public void user_takes_screenshot(String pro) throws InterruptedException, IOException {
		Thread.sleep(3000);
		screenShot(pro+".png");
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    closeEntireBrowser();
	}
	
	@After
	public void close() {
		closeEntireBrowser();

	}

}
