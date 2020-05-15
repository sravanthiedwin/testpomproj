package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.WalmartPage;

public class walmarttest extends library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://walmart.com");
		
	}
	@Test
	public void walmartfront() {
		WalmartPage wp=new WalmartPage(driver);
		wp.accoun();
		wp.createaccount();
		wp.name("edwin");
		wp.lname("amar");
		wp.e("sravanthie@gmail.com");
		wp.pwd("abc123456");
		
	}
	public void  close() throws IOException {
		screenshot("src/test/resources/screenshots/walmart.png");
		quit();
		
	}
	

}
