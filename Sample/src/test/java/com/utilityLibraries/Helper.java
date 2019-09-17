package com.utilityLibraries;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	public static void CaptureScreenshot(WebDriver driver) 
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SourceFile =scrShot.getScreenshotAs(OutputType.FILE);
		
		//In the below line we are giving Project name and time for the captured screenshot
		
		File DestFile=new File("./Screenshots/ProjectName_" + getCurrentDateTime() + ".png");
		
		try {
			FileHandler.copy(SourceFile, DestFile);
			System.out.println("Screenshot is Captured");
			
		} catch (IOException e) {
			
			System.out.println("Screenshot is not Captured"+e.getMessage());
			e.printStackTrace();
		}

		
	}
	
	public static String getCurrentDateTime()
	{
		SimpleDateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss"); 
		Date CurrentDate= new Date();
		return customformat.format(CurrentDate);
	}
	
	
}
