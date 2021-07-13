package com.Onemap.GenericLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	//@Parameters("MYBROWSER")    /*To execute scripts in different browser */
	public void OpenBrowser()
	{
		if(Constants.Browser.equalsIgnoreCase("Chrome"))
		{
			  WebDriverManager.chromedriver().setup();
			  ChromeOptions options=new ChromeOptions();
			  options.addArguments("headless");
			  driver=new ChromeDriver();
		}
		else if(Constants.Browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup(); 
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		/*
		 * Wait for every webelement in one TestScripts
		 */
	  WebCommonLib wlib=new WebCommonLib();
		wlib.PageToLoad();
	}
	@AfterClass
	public void CloseBrowser()
	{
	//driver.quit();	
	}
	@BeforeMethod
	public void LoginToApp()
	{
		
	}
	@AfterMethod
	public void LogoutFromApp()
	{

	}
}
