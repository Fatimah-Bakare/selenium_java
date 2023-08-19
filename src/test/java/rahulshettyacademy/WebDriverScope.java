package rahulshettyacademy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Step 1 -- Get the count of links on the page

		System.out.println(driver.findElements(By.tagName("a")).size());

		// Step 2 -- Get the count of links on the footer page

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope concept

		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// Step 3 --
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		// Step 4 -- Click on each link in the column and check if the pages are opening
		// For Loop -- Opens all the tabs by clicking on each link
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(3000);

		}

		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> it = windowId.iterator();

		// While Loop -- Switches the driver to the opened tabs to perform actions
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
