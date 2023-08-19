package rahulshettyacademy;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadRSA {

	public static void main(String[] args) throws InterruptedException, IOException {

		String downloadPath = System.getProperty("user.dir");

		WebDriverManager.chromedriver().setup();

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://altoconvertpdftojpg.com/");

		driver.findElement(By.cssSelector("[class*='file_browse']")).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\fatim\\Desktop\\AutoIt\\FileUpload.exe");
		
		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='submit_btn']")));

		driver.findElement(By.cssSelector("[id='submit_btn']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();

		Thread.sleep(5000);

		File f = new File(downloadPath + "/converted.zip");

		if (f.exists())

		{

			Assert.assertTrue(f.exists());

			if (f.delete())

				System.out.println("file deleted");

		}

	}

}
