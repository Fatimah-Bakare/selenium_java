package rahulshettyacademy;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleItemsToCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		int j=0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Orange", "Potato"};

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-"); //Brocolli - 1 Kg --> Brocolli , 1 kg
			String nameFormatted = name[0].trim();
			// check weather name extracted is present in the array or not -
			// convert array to array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(nameFormatted)) {
				// click on Add to Cart
				j++;
				//refer to lecture 74
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				if (j==itemsNeeded.length) 
				{
					break;
				}
			}
		}

	}

}
