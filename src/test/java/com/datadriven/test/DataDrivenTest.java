package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("C:\\Users\\fatim\\eclipse-workspace\\Test1\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
		
		String firstname = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstname);
		
		String lastname = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastname);
		
		String email = reader.getCellData("RegTestData", "email", 2);
		System.out.println(email);
		
		String password = reader.getCellData("RegTestData", "password", 2);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		

	}

}
