package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.OrangeHrmLogin;
import com.seleniumutils.sellutils;

public class orangetest extends library {

	 sellutils util;
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test
	public void loginpage() {
		OrangeHrmLogin hrm= new OrangeHrmLogin(driver);
		hrm.login("Admin", "admin123");
		
	}
	@AfterClass
	public void close() throws IOException {
		util=new sellutils(driver); 
		util.getTitle();
		util.to_take_screenshot("src/test/resources/screenshots/orangehrm1.png");
		util.quit();
		


		
	}
	
}
	


