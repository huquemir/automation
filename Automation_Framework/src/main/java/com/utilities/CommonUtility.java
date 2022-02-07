package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.google.common.io.Files;

import io.cucumber.java.Scenario;

public class CommonUtility extends BaseClass {
	
	

	public static WebElement getExplicitWait(WebElement ele, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}
	
	public static void takesScreenShot() throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //Type casting polymorphism
		File targetFile = new File(System.getProperty("user.dir") + "//screenshot/screenshot.png");
		targetFile.getParentFile().mkdir();
		srcFile.createNewFile();
		Files.copy(srcFile, targetFile);
			
	}
	
	public static void getHighLighter(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Type casting
		executor.executeScript("arguments[0].setAttribute('style','background: green; border: 4px solid black;')", element);
		
	}
	
	public static void actionsClick(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
	
	
	public static void getJsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Type casting
		executor.executeScript("arguments[0].click()", element);
		
	}
	
	
	
}
