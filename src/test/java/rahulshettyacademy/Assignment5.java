package rahulshettyacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		WebElement topFrame = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFrame);
		
		System.out.println(driver.findElements(By.xpath("//frameset[@name='frameset-middle']//frame")).size());
		
		WebElement middleFrame = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(middleFrame);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		

	}

}
