package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PageFactoryElements extends BaseClass {
	//Page object model design pattern
	//Page factory is a repository used to store all our elements of locator
	//Page factory uses the encapsulation concepts from java.
	//Encapsulation uses private variable, getter and setter method, finish within class
	
	//Create a constructor- 
	//A constructor is a special type of method that has the same classname as methodname
	//A constructor invokes implicitly or automatically
	
	
	public PageFactoryElements() {
		PageFactory.initElements(driver, this);	
	
	}
	
	//We have to use pagefactory annotation to store the elements
	
	@FindBy(xpath = "(//*[text()='Sign in'])[2]")
	@CacheLookup
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id = "input-email-address")
	@CacheLookup
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(css = "#input-email-address")
	@CacheLookup
	private WebElement cssEmail;

	public WebElement getCssEmail() {
		return cssEmail;
	}
	
	@FindBy(css = ".css-mx98y1-Text eczcs4p0")
	@CacheLookup
	private WebElement cssSignIn;

	public WebElement getCssSignIn() {
		return cssSignIn;
	}
	
	@FindBy(id = "input-password")
	@CacheLookup
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	

	
	@FindBy(xpath = "(//*[text()='Sign in'])[5]")
	@CacheLookup
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}


	




	
	
	
	
	
	

}
