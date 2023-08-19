package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch Chrome Browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("Google Logo Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Google search Test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Log Out from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
}
