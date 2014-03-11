package com.sel.test;

 import java.util.*;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.support.ui.ExpectedCondition;
 import org.openqa.selenium.support.ui.WebDriverWait;
 

 public class webdriver_api  {
	 
     public static void main(String[] args) {
    	 
         // Create a new instance of the firefox driver
         // Notice that the remainder of the code relies on the interface, 
         // not the implementation.
    	 
    	
         WebDriver driver = new FirefoxDriver();

         // And now use this to visit Google
         driver.get("http://www.google.com");
         
         // Alternatively the same thing can be done like this
          //driver.navigate().to("https://events.developerforce.com/signup");

        // Find the text input element by various locators
        //WebElement element = driver.findElement(By.name("q"));
        //WebElement element = driver.findElement(By.className("gbqfif"));
        // WebElement element = driver.findElement(By.id("gbqfq"));
         //Finds the first available tag with the given tagname
        //WebElement element = driver.findElement(By.tagName("input")); 
        //WebElement element = driver.findElement(By.cssSelector("#gs_lc0 input.gbqfif"));
        // WebElement element = driver.findElement(By.xpath("//*[@id=\"gbqfq\"]"));
         
         //List elements that belong to a particular class
        // List<WebElement> links = driver.findElements(By.tagName("a"));
         
       //  for(WebElement l : links){
        	 
        //	 System.out.println(l.getText());
        	 
       //  }
         
         List<WebElement> select = driver.findElements(By.tagName("select"));
        // List<WebElement> allOptions = select[0].findElements(By.tagName("option"));
        // for (WebElement option : allOptions) {
          //   System.out.println(String.format("Value is: %s", option.getAttribute("value")));
           //  option.click();
        // }

         // Enter something to search for
         //element.sendKeys("Cheese!");

         // Now submit the form. WebDriver will find the form for us from the element
         //element.submit();

         // Check the title of the page
         System.out.println("Page title is: " + driver.getTitle());
        // driver.switchTo().window("Google");
         //System.out.println("Page title is: " + driver.getTitle());
         
         
        // driver.navigate().forward();
         //driver.navigate().back();
         
         // Google's search is rendered dynamically with JavaScript.
         // Wait for the page to load, timeout after 10 seconds
     //    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
     //        public Boolean apply(WebDriver d) {
     //            return d.getTitle().toLowerCase().startsWith("cheese!");
     //        }
     //    });

         // Should see: "cheese! - Google Search"
    //     System.out.println("Page title is: " + driver.getTitle());
         
         //driver.quit();
     }
 }