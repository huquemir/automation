package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser) {
		//Where do you implement interface in your framework?
		//Ans: WebDriver is an interface I use in my framework
		if (browser.equalsIgnoreCase("chrome")) {	
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver(); // UpCasting polymorphism
		
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver(); // UpCasting polymorphism
		} else {
			System.out.println("The browser does not exist");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void openApplication() {
		driver.get("https://www.facebook.com/");
		
	}
	
	
	



}
