package com.seleniumchallenges;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class MultipleWindows extends BaseClass {
	
	//How to handle the multiple windows?
	
	@Test
	public static void switchWindow() {
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		//To handle multiple windows, I have to use the getwindowhandle method and store
		// the getwindowhandle method in a string variable
		String mainwindow = driver.getWindowHandle(); //parent window
		
		//Then I need to use the Set interface  to take control of the child window with 
		// getwindowhandles method
		Set<String> s1 = driver.getWindowHandles(); // child window
		
		//Then I need to control window one by one using the iterator
		Iterator<String> i1 = s1.iterator();
		
		//Then I have to use the loop. Inside the loop, I have to call the iterator 
		//object and the hasnext method which will ignore the parent window
		while (i1.hasNext()) {
			//The next method will count the number of child windows and store this
			//into a string variable
			String ChildWindow = i1.next();
				//In order to take control of the child window, I have to put the condition
				//mainwindow is not equal to the child window
				if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
		
					//If the condition is satisfied, it will switch to the child window
					driver.switchTo().window(ChildWindow);
					//I have to close the child window
					driver.close();
				}
			
		} 
					//Finally I have to switch back to the main window
					driver.switchTo().window(mainwindow);
		
		
	}
	

}
