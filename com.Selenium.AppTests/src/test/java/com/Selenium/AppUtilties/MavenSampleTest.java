package com.Selenium.AppUtilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenSampleTest {
	
	 public static WebDriver driver;
		public static String expurl = "https://www.mycontactform.com/";
	
	
  @Test
  public void f() throws Exception {
	  
	  //How to push maven project to GitHub server
	  //1) Open git.com
	  //2) Create new login
	  //3) Login with user credentials
	  //4) Create new repository
	  //5) copy the repository path
	  
	  //Steps to push maven project to git
	  //1) Rigt click on project
	  //2) Select Team >Share Project
	  
	  
	System.out.println("Sample Test");  
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
