package seleniumprojectone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch chrome:
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get url:
		driver.get("https://app.hubspot.com/login");
		
		String title = driver.getTitle();
		System.out.println("Before login title is " + title);
		
		//Naveen Automationlabs Session 13 -- Check for detailed explanation
		
		//1. isDisplayed() method: applicable for all element:
		boolean b1 = driver.findElement(By.id("loginBtn")).isDisplayed();
		System.out.println(b1);
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.id("loginBtn")).isEnabled();
		System.out.println(b2);
		
//		//3. isSelected() method:
//		boolean b3 = driver.findElement(By.id("loginBtn")).isSelected();
//		System.out.println(b3);

	}

}
