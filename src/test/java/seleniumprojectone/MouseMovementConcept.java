package seleniumprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch chrome:
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//get url:
		driver.get("https://www.spicejet.com/");
		
		//get and print page title:
		String title = driver.getTitle();
		System.out.println(title);
		
		//MouseMovement:
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//div[text()= 'Add-ons'])")));
		
		Thread.sleep(3000);
		
		WebElement spicemax = driver.findElement(By.xpath("(//div[text()= 'SpiceMax'])"));
		spicemax.click(); 

	}

}
