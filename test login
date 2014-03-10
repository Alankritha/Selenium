package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class test_gmail_login {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://mail.google.com/");
		selenium.start();
	}

	@Test
	public void testTest_gmail_login() throws Exception {
		selenium.open("/");
		selenium.type("id=Email", "***********");
		selenium.type("id=Passwd", "***********");
		selenium.click("id=signIn");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
