package com.sel.test;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class drop_down  {
    public static void main(String[] args) {
       
    	 WebDriver driver = new FirefoxDriver();
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
     	
    	 driver.get("http://www.amazon.com");
    	 
    	 WebElement link = driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/a/span/span/span[2]"));
    	 link.click();
  
         List<WebElement> lilist = driver.findElements(By.tagName("li"));
         
         
         
         for (WebElement li : lilist){
        	
        	 
        	 
        	 if(li.getAttribute("id").startsWith("nav_cat")){
        		 
        		 System.out.println(li.getText());
        		 System.out.println(li.getAttribute("id"));
        		 
        		 
        	 }
        		 
         }
        
    }
    
}