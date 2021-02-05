package com.AppProject;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Selenium.AppUtilties.BrowserFactory;
import com.Selenium.AppUtilties.ConfigReader;

public class AppHomePageLinks {
	
	
	public static WebDriver driver;
	public static BrowserFactory browser;
	public static ConfigReader config;
	
	
	
	@BeforeSuite
	public void AppLinksSuite() {
		browser=new BrowserFactory();
		config=new ConfigReader();
	}
	
	
	
	@BeforeTest
	public void launchBrowser() {
		
		
		 driver=BrowserFactory.getBrowser(config.getbrowsername(),config.getbrowserurl());
		 System.out.println("launching browser");
	}
	
  @Test(description="Verifying weblinks")
  public void pageWeblinks() {
	  
	  
	 
	  TreeSet<String> arraylist = new TreeSet<String>();
		
		List<WebElement> weblinks = driver.findElements(By.tagName("a"));
		
		for(WebElement linksdata : weblinks) {
			
			arraylist.add(linksdata.getAttribute("href"));
			
			
		}
		
		for(String weblinkdata : arraylist) {
			
			driver.get(weblinkdata);
			
			System.out.println(weblinkdata);
		}
		
	  
  }
  
  
  @AfterTest
  public void closebrowser() {
	  browser.closebrowser();
  }
  
  
}
