package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "email", "password"})
	public void HubSpotLoginTest(String browser, String url, String email, String password) {
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\geckodriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
	}

}
