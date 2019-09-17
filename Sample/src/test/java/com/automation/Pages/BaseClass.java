package com.automation.Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utilityLibraries.BrowserFactory;
import com.utilityLibraries.ConfigDataProvider;
import com.utilityLibraries.ExcelDataProvider;
import com.utilityLibraries.Helper;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
    public ExtentReports report;
    public ExtentTest logger;
	// In Before Suite the object of class will be initialized

	@BeforeSuite
	public void setupSuite() {
		//excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
		report = new ExtentReports();
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "./Reports/FreeCrm.html"));
		report.attachReporter(extent);
	}

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getQAURL());
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	//This annotation will execute after every test case and it will check conditions
	@AfterMethod
	public void teardownmethod(ITestResult result )
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		Helper.CaptureScreenshot(driver);	
		}
		report.flush();
	}
	

}
