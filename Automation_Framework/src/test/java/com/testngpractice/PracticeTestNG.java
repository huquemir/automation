package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PracticeTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	}
	
	@Test
	public void openApplication() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("myemail@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mypass");
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.quit();
	}
	
	
	
	

}
