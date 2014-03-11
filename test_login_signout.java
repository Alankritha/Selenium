package com.sel.test;


 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.support.ui.ExpectedCondition;
 import org.openqa.selenium.support.ui.WebDriverWait;

 public class test_login  {
     public static void main(String[] args) {
         // Create a new instance of the Firefox driver
         // Notice that the remainder of the code relies on the interface, 
         // not the implementation.
         WebDriver driver = new FirefoxDriver();

         // And now use this to visit Gmail
         driver.get("http://www.gmail.com");
         
         

         // Find the text input element by its name
         WebElement email = driver.findElement(By.id("Email"));
         WebElement password = driver.findElement(By.id("Passwd"));
         WebElement signin = driver.findElement(By.id("signIn"));

         
         
         // Enter email and password
         email.sendKeys("********");
         password.sendKeys("********");

         // Now submit the form. WebDriver will find the form for us from the element
         //password.submit();
         signin.click();

         // Check the title of the page
         System.out.println("Page title is: " + driver.getTitle());
         
         //Signout
         WebElement lnk = driver.findElement(By.className("gb_0"));
         lnk.click();
         WebElement signout = driver.findElement(By.id("gb_71"));
         signout.click();
         
         // Google's search is rendered dynamically with JavaScript.
         // Wait for the page to load, timeout after 10 seconds
     //    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
     //        public Boolean apply(WebDriver d) {
     //            return d.getTitle().toLowerCase().startsWith("cheese!");
     //        }
     //    });

         // Should see: "cheese! - Google Search"
    //     System.out.println("Page title is: " + driver.getTitle());
         
      //   driver.quit();
     }
 }