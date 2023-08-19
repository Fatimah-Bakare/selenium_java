package rahulshettyacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		Actions action = new Actions(driver);
		
		WebElement searchField = driver.findElement(By.id("nav-search-bar-form"));
		action.moveToElement(searchField).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		WebElement accountandList = driver.findElement(By.id("nav-link-accountList"));
		//action.moveToElement(accountandList).build().perform();
		action.moveToElement(accountandList).contextClick().build().perform();

	}

}
