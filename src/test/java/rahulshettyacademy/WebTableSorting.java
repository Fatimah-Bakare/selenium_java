package rahulshettyacademy;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Capture all webElements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		// Capture texts of all webElements into new list --> original list
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// Sort on the original list of step 3 --> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// Compare the original list vs. sorted list
		Assert.assertTrue(originalList.equals(sortedList));

		// Scan the name column with getText() --> Beans --> print the price of Beans
		List<String> price;
		List<String> priceRice;

		price = elementList.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggies(s))
				.collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			priceRice = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggies(s))
					.collect(Collectors.toList());
			priceRice.forEach(a -> System.out.println(a));
			if (priceRice.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (priceRice.size() < 1);

	}

	private static String getPriceVeggies(WebElement s) {

		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return priceValue;
	}

}
