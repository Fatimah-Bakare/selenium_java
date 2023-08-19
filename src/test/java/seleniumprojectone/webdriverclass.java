package seleniumprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//launch driver
		WebDriver driver = new ChromeDriver();
		
		//enter url
				driver.get("https://app.hubspot.com/login");
				
				//get title
				String title = driver.getTitle();
				System.out.println(title);
				
				//1. XPATH:
				
				//driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("JohnDoe@gmail.com");
				
				//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Doe@12345");
				
				//driver.findElement(By.xpath("//span[@data-indicator='true']")).click();
				
				//driver.findElement(By.xpath("//*[@id=\'loginBtn\']")).click();
				
				//2. ID:
				
				//driver.findElement(By.id("username")).sendKeys("JohnDoe@gmail.com");
				
				//driver.findElement(By.id("password")).sendKeys("Doe@12345");
				
				//driver.findElement(By.id("loginBtn")).click();
				
				//3. CSSSELECTOR:
				
				driver.findElement(By.cssSelector("input#username")).sendKeys("JohnDoe@gmail.com");
				
				driver.findElement(By.cssSelector("input#password")).sendKeys("Doe@12345");
				
				driver.findElement(By.cssSelector("button#loginBtn")).click();
		
		

	}

}
