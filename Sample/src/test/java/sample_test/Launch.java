package sample_test;

import java.io.IOException;

import org.testng.annotations.Test;

public class Launch {
	
	@Test
	public Launch() throws IOException, InterruptedException {
		
		
		Runtime.getRuntime().exec("D:\\Vikas Kumar Documents\\Selenium docs\\Drivers\\chromedriver.exe");
	    System.out.println("Launch");
	}

}
