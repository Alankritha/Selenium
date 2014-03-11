package com.sel.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class select_list {
	
	public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	
	

    driver.get("http://events.developerforce.com/signup");
    
    WebElement select = driver.findElement(By.id("country"));
	  
	   
       
       List<WebElement> allOptions = select.findElements(By.tagName("option"));
       System.out.println(allOptions.size());
       for (WebElement option : allOptions) {
           System.out.println(String.format("Value is: %s", option.getText()));
           option.click();
       }
	}
}
