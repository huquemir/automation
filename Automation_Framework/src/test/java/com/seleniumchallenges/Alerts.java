package com.seleniumchallenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utilities.CommonUtility;


public class Alerts extends BaseClass {
	//How to handle the Alert in your project?
	//First I switch to the alert with the Alert interface and driver.switchTo().alert() method
	//Then I can click on ok using the alert object with the accept method 
	//or I can click on cancel with alert dismiss method
	
	@Test
	public static void alertMessage() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		
		//driver.findElement(By.id("confirmButton")).click();
		
		WebElement element = driver.findElement(By.id("confirmButton"));		
		CommonUtility.actionsClick(element);
		
		//Must know Alert is an interface. In order to create the object, you need to use the Alerts class
			
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();	// or you can do arert.dismiss() 
		
		String expected = "You selected Ok";
		String actual = driver.findElement(By.id("confirmResult")).getText();		
		Assert.assertEquals(actual, expected);
		
	}

}
