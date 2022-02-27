package com.seleniumchallenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Alerts {
	
	@Test
	public void alertMessage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // UpCasting polymorphism
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("confirmButton")).click();
		
		//Must know Alert is an interface. In order to create the object, you need to use the Alerts class
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
//		String expected = "You selected Ok";
//		System.out.println(expected);
//		String actual = driver.findElement(By.id("confirmResult")).getText();
		
//		System.out.println(actual);
//		
//		Assert.assertEquals(actual, expected);
		
	}

}
