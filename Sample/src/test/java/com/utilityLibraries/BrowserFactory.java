package com.utilityLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browsername, String AppUrl) 
	{
	
		if (browsername.equalsIgnoreCase("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browsername.equalsIgnoreCase("IE")) 
		{

			System.setProperty("webdriver.chrome.driver", "./IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AppUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
