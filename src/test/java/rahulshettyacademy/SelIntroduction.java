package rahulshettyacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {


		//Invoking Browser
		//Chrome - ChromeDriver -> Methods
		//Firefox - FirefoxDriver -> Methods
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.close() closes just the current window in which you webdriver is operating
		driver.close();
		
		//driver.quit() quits terminates the entire chromedriver.exe execution - i.e, all program running is terminated
		driver.quit();

	}

}
