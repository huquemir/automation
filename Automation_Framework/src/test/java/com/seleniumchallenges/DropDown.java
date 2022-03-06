package com.seleniumchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class DropDown extends BaseClass {
	//How to handle the dropdown?
	@Test
	public static void dropDownMenu() {
		driver.get("https://demoqa.com/select-menu");
		
		//Create a reference variable for the web element
		WebElement dropdownmenu = driver.findElement(By.id("oldSelectMenu"));
		//You have to use the Select Class and create the dropdown object and pass the
		//locator or reference variable
		Select dropdown = new Select(dropdownmenu);
		//Then I can select the dropdown option using either selectbyinde or selectbyvisibletext
		//or selectbyvalue
		//dropdown.selectByIndex(5);
		dropdown.selectByVisibleText("Blue");
	}
	


}
