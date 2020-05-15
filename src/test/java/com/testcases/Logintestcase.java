package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.FacebookLogin;

public class Logintestcase extends library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://facebook.com");
		
	}
	@Test
	public void login() {
		FacebookLogin lpage=new FacebookLogin(driver);
		lpage.loginToApp_username("sravanthi");
		lpage.loginToApp_password("abcz1");
		lpage.loginToApp_loginbutton();
		
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src/test/resources/screenshots/facebook.png");
		quit();
		
	}

}
