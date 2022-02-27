package com.exceptions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.baseclass.BaseClass;

public class SeleniumExceptions extends BaseClass {
	
	
    // Use the Fluent wait to handle the stale element exception
	
	//You have to memorize this code
	public void staleElementExample() {
		//This is the fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS) //Maximum time to wait
				.pollingEvery(5, TimeUnit.SECONDS) //checking if the element is visible every 5 seconds
				.ignoring(NoSuchElementException.class); //ignores the Exception 
		
	}



}
