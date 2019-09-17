package com.utilityLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;

	public ConfigDataProvider()

	{
		File src = new File("./Config/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			
			  System.out.println("Not able to load config File" + e.getMessage());
			 
		}

	}
	


	public String getBrowser() {
		return prop.getProperty("Browser");
	}

	public String getQAURL() {
		return prop.getProperty("qaURL");
	}
	
	public String getusername() {
		return prop.getProperty("username");
	}
	public String getpassword() {
		return prop.getProperty("password");
	}
}
