package com.sel.test;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import  com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import java.net.*;
import java.io.*;


public class grid {
	
	public static void main(String[] args){
		
		//Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox","http://www.google.com");
	
		//selenium.type("id=q", "hello");
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.valueOf("WINDOWS"));

		try{
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("treesoft solutions");
		
		System.out.println(driver.getTitle());
		
		
		}
		catch(MalformedURLException  e)
		{
			e.printStackTrace();
		}
		
		
	}
}

/*cmd prompt commands for node registration

E:\Arun\Selenium>java -jar selenium-server-standalone-2.39.0.jar -role node -port 5555 -hub http://localhost:4444/grid/register -browser browserName=chrome,maxInstances=5,platform=WINDOWS -Dwebdriver.chrome.driver="E:\Arun\Selenium\chromedriver_win32_2.3\chromedriver.exe"

E:\Arun\Selenium>java -jar selenium-server-standalone-2.39.0.jar -role node -port 5556 -hub http://localhost:4444/grid/register -browser browserName=firefox,maxInstances=5,platform=WINDOWS
*/
