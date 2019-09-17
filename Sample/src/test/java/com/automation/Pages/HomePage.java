package com.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;

	}

	// Locators for Home Page
	  @FindBy(xpath="//img[contains(@src,'/webres_5d186a4a987cc7.73469913/orangehrmLeavePlugin/images/ApplyLeave.png')]") WebElement leave;
	
	  

		public void ClickLeave() {
			
			leave.click();
		}
	  
	  
	
}
