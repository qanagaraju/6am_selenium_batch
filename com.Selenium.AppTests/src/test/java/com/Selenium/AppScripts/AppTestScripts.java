package com.Selenium.AppScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTestScripts 
{
    public static WebDriver driver;
	public static String expurl = "https://www.mycontactform.com/";
	
	
    @Test
    public void launchbrowser() throws Exception
    {
       
    	System.setProperty("webdriver.chrome.driver", "./myDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(expurl);
		
		Thread.sleep(3000);
		
		if(expurl.equals(driver.getCurrentUrl())) {
			System.out.println("Verified url");
		}
		else
		{
			System.out.println("Does not verified");
		}
		
		
		
		driver.close();
    	
    	
    	
    }
}
