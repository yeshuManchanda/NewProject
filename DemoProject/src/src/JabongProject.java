package src;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


//public class JabongProject {

	//public static void main(String[] args) throws InterruptedException {
		

		class PoPUpHandle {

			public static void main(String[] args) throws InterruptedException {
						
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver","D:\\Vikas Kumar Documents\\Selenium docs\\Drivers\\chromedriver.exe");
				WebDriver driver =new ChromeDriver(options);
				driver.get("https://www.jabong.com");
				driver.manage().window().maximize();
				
				 driver.findElement(By.id("signin-model-wishlist")).click(); 

				 Thread.sleep(5000);
			     driver.findElement(By.id("login-email")).sendKeys("yeshu.manchanda@gmail.com"); 
			     driver.findElement(By.id("login-pwd")).sendKeys("Welcome1"); 
			     driver.findElement(By.id("btn-login")).click();
			    
			     Thread.sleep(5000);

				 
				 Actions action = new Actions(driver); 
		         WebElement women = driver.findElement(By.linkText("WOMEN")); 
		         action.moveToElement(women).moveToElement(women).perform(); 
		         Thread.sleep(5000);
		        driver.findElement(By.xpath("//*[@id=\"mainTopNav\"]/li[1]/div/div[3]/div[2]/a[2]")).click() ;
		        
		        Thread.sleep(3000);
		        
		        driver.findElement(By.id("search")).sendKeys("women black tops");

		     driver.findElement(By.xpath("//*[@id=\"top-search-input\"]/div[1]")).click();

				 

		                   
		  List<WebElement> lst=  driver.findElements(By.xpath("//div[@class='col-xxs-6 col-xs-4 col-sm-4 col-md-3 col-lg-3 product-tile img-responsive']"));
		  System.out.println("Size of Array" + lst.size());
		  
		  for (int i=1; i<=4; i++)
		  {
			  lst.get(1).click();
			  List<WebElement> Size = driver.findElements(By.xpath("//ul[@class='options']/li[@class='first popover-options ']"));
			  
			 System.out.println(Size.size());
			 
		  
		  }
			  }
			  

			
		}

