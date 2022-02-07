package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pagefactory.PageFactoryElements;
import com.utilities.CommonUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginFunction extends BaseClass {
	
	PageFactoryElements pf;
	
	@Given("User can open any browser")
	public void user_can_open_any_browser() {
		
	    pf = PageFactory.initElements(driver, PageFactoryElements.class);
	    
	}
	
	@Given("User is able to enter {string} url")
	public void user_is_able_to_enter_url(String url) {
	
		driver.get(url);
	    
	}
	@When("User clicks on the Login in button")
	public void user_clicks_on_the_login_in_button() throws IOException {
		//polymorphism - method overloading or static binding or compiletime polymorphism
		CommonUtility.getExplicitWait(pf.getLogin(), 15);
		//CommonUtility.takesScreenShot();
		pf.getLogin().click();
		
		
	    
	}
	
	@When("User enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) throws InterruptedException, IOException {
		CommonUtility.getExplicitWait(pf.getEmail(), 12);
		CommonUtility.getHighLighter(pf.getEmail());
		pf.getEmail().sendKeys(email);
		pf.getPassword().sendKeys(password);		
		//CommonUtility.takesScreenShot();
		
		
	    
	}
	@When("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		pf.getPassword().submit();
		//CommonUtility.getJsClick(pf.getSignIn());
		//CommonUtility.actionsClick(pf.getSignIn());
		//pf.getSignIn().click();
	    
	}

	
	@Then("User is able to verify successful login & verify page title")
	public void user_is_able_to_verify_successful_login_verify_page_title() {
		System.out.println("The title of the website is : "+driver.getTitle());
		String expected = "Sign in to Zoopla - Zooplas67";
		Assert.assertEquals(expected, driver.getTitle());
		
	    
	}

	

}
