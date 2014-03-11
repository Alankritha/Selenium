package com.sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriverBackedSelenium;
import com.thoughtworks.selenium.*;

public class selenium_backed_webdriver {

	 public static void main(String[] args) {
		 
	 
	WebDriver driver = new FirefoxDriver();

	// A "base url", used by selenium to resolve relative URLs
	 String baseUrl = "http://www.google.com";

	// Create the Selenium implementation
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);

	// Perform actions with selenium

	selenium.open("http://www.google.com");
	selenium.type("name=q", "cheese");
	selenium.click("name=btnG");

	// Get the underlying WebDriver implementation back. This will refer to the
	// same WebDriver instance as the "driver" variable above.
	WebDriver driverInstance = ((WebDriverBackedSelenium) selenium).getWrappedDriver();

	//Finally, close the browser. Call stop on the WebDriverBackedSelenium instance
	//instead of calling driver.quit(). Otherwise, the JVM will continue running after
	//the browser has been closed.
	//selenium.stop();
	
	 }
	 
}
