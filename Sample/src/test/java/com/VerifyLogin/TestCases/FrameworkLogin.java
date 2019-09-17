package com.VerifyLogin.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.automation.Pages.BaseClass;
import com.automation.Pages.HomePage;
import com.automation.Pages.LoginPage;
import com.utilityLibraries.Helper;

public class FrameworkLogin extends BaseClass {

	@Test

	public void Login() throws InterruptedException {
		
		logger = report.createTest("Login to FreeCRM");
		LoginPage OLoginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.pass("Login Pass");
	    OLoginPage.loginToCRM(config.getusername(), config.getpassword());
		HomePage OHomePage =PageFactory.initElements(driver, HomePage.class);
		OHomePage.ClickLeave();
		Thread.sleep(10000);
		logger.info("Starting Application");

		//OLoginPage.loginToCRM(config.getBrowser(), config.getQAURL());

		
		Helper.CaptureScreenshot(driver);
	}

}
