package seleniumprojectone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch chrome:
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get url:
		driver.get("https://app.hubspot.com/login");
		
		String title = driver.getTitle();
		System.out.println("Before login title is " + title);
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("JohnDoe@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("p@ssw0rd");
		driver.findElement(By.xpath("//*[@id=\'loginBtn\']")).click();
		
		Thread.sleep(3000);
		
		System.out.println("After login title is " + title);


	}

}
