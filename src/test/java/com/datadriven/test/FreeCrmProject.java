package com.datadriven.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FreeCrmProject {
	
	WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
	}
	
	@Test
	public void loginBtn() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]")).click();
	
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("teemakareem96@gmail.com");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd123");
		
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
