package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		
		Assert.assertTrue(b);
		//or
		Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
