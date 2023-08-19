package rahulshettyacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocators.*;

import org.openqa.selenium.By;

public class RelativeLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
//		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		

	}

}
