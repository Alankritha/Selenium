package com.sel.test;

 import java.util.*;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.support.ui.ExpectedCondition;
 import org.openqa.selenium.support.ui.WebDriverWait;


 public class list_links  {
	 
     public static void main(String[] args) {
         // Create a new instance of the Firefox driver
         // Notice that the remainder of the code relies on the interface, 
         // not the implementation.
         WebDriver driver = new ChromeDriver();

         // And now use this to visit naurki
        // driver.get("http://naukri.com");
       driver.navigate().to("https://www.force.com");
         
         

         // Find the text input element by its name
         WebElement login = driver.findElement(By.id("button-login"));
         login.click();
         System.out.println("Page title is: " + driver.getTitle());
         driver.navigate().back();
         System.out.println("Page title is: " + driver.getTitle());
         driver.navigate().forward();
         System.out.println("Page title is: " + driver.getTitle());
         
         
         for(WebElement templink : links){
        	 
        	 System.out.println(templink.getText());
        	 
        }
         
        // System.out.println("Page title is: " + driver.getTitle());
       //  System.out.println("There are " + links.size()+" links");
         
         

        
         
      //   driver.quit();
     }
 }