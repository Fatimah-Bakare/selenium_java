package rahulshettyacademy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleItemsToCart2ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Orange", "Potato" };
		addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-"); // Brocolli - 1 Kg --> Brocolli , 1 kg
			String nameFormatted = name[0].trim();
			// check weather name extracted is present in the array or not -
			// convert array to array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(nameFormatted)) {
				// click on Add to Cart
				j++;
				// refer to lecture 74
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
