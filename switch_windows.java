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

public class switch_windows  {
	
    public static void main(String[] args) {
       
    	 WebDriver driver = new FirefoxDriver();
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
     	
    	 driver.get("http://www.w3schools.com/html/html_iframe.asp");
    	
    	  
    	 /*try{
    		 WebElement prego = driver.findElement(By.className("prego"));
    		 prego.click();
    	 }
    	 catch(WebDriverException e){
    		 throw e;
    	 }*/
    	
    	// Set<String> handles = driver.getWindowHandles();
    	 
    	 //System.out.println(handles.size());

    	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    		   
    	 /*for (String handle : driver.getWindowHandles()){
    		    WebDriver dialog = driver.switchTo().window(handle);
    		    System.out.println(dialog.getTitle());
    		    dialog.close();
    		    
    	 }*/
    	 
    	 String mainWinHandle = driver.getWindowHandle();

    	Set<String> allhandles = driver.getWindowHandles();

    	for(String handle : allhandles)
    	{
    		System.out.println(driver.switchTo().window(handle).getTitle());
    		
    	    if(!mainWinHandle.equals(handle))
    	    {
    	        
    	        WebDriver popup = driver.switchTo().window(handle);
    	        
    	        popup.close();
    	        
    	    }
    	}
    		    	
    }
}
