package rahulshettyacademy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Broken URL
		// Step 1 -- get all URLs tied up to the links using Selenium
		// Java methods -- will call the URL and get the status code
		// If status code is >400, then the link is not working. Link which is tied up
		// to that URL is broken.
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int respCode = connection.getResponseCode();
		System.out.println(respCode);

	}

}
