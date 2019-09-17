package com.amazon.Sample;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import demo.Login;


public class LoginDetails {

@Test
	
public void Launch() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\Vikas Kumar Documents\\Selenium docs\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
       Login objLogin = new Login(driver);
       objLogin.ValidDetails("admin","demo123");
       

       
	}
}
