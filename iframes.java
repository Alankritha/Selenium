package com.sel.test;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class iframes  {
	
    public static void main(String[] args) {
       
    	 WebDriver driver = new FirefoxDriver();
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
     	
    	 driver.get("http://www.w3schools.com/html/html_iframe.asp");
    	
    	  
    	 
    	 String mainWinHandle = driver.getWindowHandle();

    	Set<String> allhandles = driver.getWindowHandles();

    	for(String handle : allhandles)
    	{
    		System.out.println(driver.switchTo().window(handle).getTitle());
    		
    		//driver.switchTo().frame(0);
    		
    	    
    	        
    	        WebDriver iframe = driver.switchTo().window(handle);
    	        
    	        List<WebElement> links = iframe.findElements(By.tagName("a"));
    	        
    	        for(WebElement link : links){
    	        	System.out.println(link.getText());
    	        }
    	        
    	       // popup.close();
    	        
    	    
    	}
    		    	
    }
}
