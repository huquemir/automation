package com.hooks;

import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utilities.CommonUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@Before	
	public void initialization() {
		setUp("chrome");

	}

	
	@After
	public void tearDown() {
	
		//driver.quit();
		
	}

	


}
