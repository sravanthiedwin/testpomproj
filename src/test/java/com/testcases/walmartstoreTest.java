package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.WalmartStore;

public class walmartstoreTest extends library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://walmart.com");
		
	}
	@Test
	public void stores() throws IOException, InterruptedException {
		WalmartStore wstore=new WalmartStore(driver);
		wstore.stores();
		wstore.lstore();
		screenshot("src/test/resources/screenshots/walmart.png");
		wstore.mstore();
		wstore.weekly();
	}
	@AfterClass
	public void close() throws IOException {
		
		quit();
		
	}
}
