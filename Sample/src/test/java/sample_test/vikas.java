package sample_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class vikas {
	
	
	@Test 
	@Parameters("browser")
	public void test(String browser)
	{
	 if(browser.equalsIgnoreCase("chrome")) 
		{
			
		WebDriver driver = new ChromeDriver();	
		System.setProperty("webdriver.chrome.driver","D:\\Vikas Kumar Documents\\Selenium docs\\Drivers\\chromedriver.exe");
		driver.get("http://www.google.com");
						
		}
		
		else if(browser.equalsIgnoreCase("IEdriver")) 
		{
			
		WebDriver driver = new InternetExplorerDriver();	
		System.setProperty("webdriver.ie.driver","D:\\Vikas Kumar Documents\\Selenium docs\\Drivers\\IEDriverServer.exe");
		driver.get("http://www.google.com");
			
		
		}
		
	}

}


