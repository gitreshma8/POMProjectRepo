package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.WaitUtil;


public class BasePageTest {
	
	 WebDriver driver; 
	 
	 
	 @BeforeTest
	 public void browserSetup() {
		  	
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		   driver=new ChromeDriver();
			driver.manage().window().maximize(); 	
//			driver.manage().timeouts().implicitlyWait( WaitUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
//			 driver.get("https://demoqa.com/automation-practice-form");
			 
	 }

	 
	 @AfterTest 
	 
	 public void closeBrowser() {
		 
		 driver.close();
	 }
}
