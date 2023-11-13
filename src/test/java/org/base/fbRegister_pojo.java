package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbRegister_pojo extends BaseClass{
	public fbRegister_pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	@FindBy(xpath = "(//input[@type ='text'])[2]")
	private WebElement firstName;
	
	@FindBy(xpath = "(//input[@type ='text'])[3]")
	private WebElement secondName;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileOrEmail;
	
	@FindBy(id = "password_step_input")
	private WebElement newPassword;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public WebElement getMobileOrEmail() {
		return mobileOrEmail;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}
	
}
