package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By username= By.xpath("//input[@id='usernameOrEmail']");
	By Button =By.xpath("//div/button[contains(text(),'Continue')]");
	By password = By.xpath("//input[@id='password']");
	By clickbutton = By.xpath("//div/button[contains(text(),'Log In')]");
	
	
	public Login(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void ValidDetails(String uid ,String Pass)
	
	{
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(Button).click();
		driver.findElement(password).sendKeys("Aug@2019");
		driver.findElement(clickbutton).click();
		driver.quit();
	}
}

