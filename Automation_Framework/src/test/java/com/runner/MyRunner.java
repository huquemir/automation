package com.runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features/",
		glue = {"com.stepdefinition", "com.hooks"},
		plugin = {"json:target/cucumber.json"},
		monochrome = true,
		dryRun = false,
		tags = "@smoke"
		)

public class MyRunner extends AbstractTestNGCucumberTests {
	

	
	
	
}
