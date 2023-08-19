package seleniumprojectone;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch chrome:
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//get url:
		driver.get("https://www.google.com/");
		
		//Take screenshot and store as a file format:
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//now copy the screenshot to your desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\fatim\\eclipse-workspace\\Test1\\src\\test\\java\\seleniumprojectone\\google.png"));

	}

}
