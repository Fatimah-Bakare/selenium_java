package rahulshettyacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJsExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// window.scrollBy(0,500) -- Can be written on the Html console to make sure it
		// is correct and executable
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		// document.querySelector(".tableFixHead").scrollTop=5000 --Can be written on
		// the Html console to make sure it is the correct method
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

	}

}
