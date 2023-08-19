package rahulshettyacademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class WebTableJsExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// window.scrollBy(0,500) -- Can be written on the Html console to make sure it
		// is correct and executable
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		// document.querySelector(".tableFixHead").scrollTop=5000 --Can be written on
		// the Html console to make sure it is the correct method
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;

		for (int i = 0; i < values.size(); i++) {
			// Integer.parseInt -- is used to convert string to integer
			// System.out.println(Integer.parseInt(values.get(i).getText()));

			// To sum up all the values in the column:
			sum = sum + Integer.parseInt(values.get(i).getText());
		}

		System.out.println(sum);
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);

	}

}
