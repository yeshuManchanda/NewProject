package com.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;

	}
	// Locators for Login Page
    @FindBy(name="txtUsername") WebElement uname;
	@FindBy(name = "txtPassword")	WebElement pass;
	@FindBy(name = "Submit")WebElement login;
	//@FindBy(xpath = "//div[text()='Login']")	WebElement LoginButton;

	

	public void loginToCRM(String username, String password) {
		uname.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}

}
