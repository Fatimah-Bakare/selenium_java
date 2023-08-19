package rahulshettyacademy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://altoconvertpdftojpg.com/");

		driver.findElement(By.cssSelector("[class*='file_browse']")).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\fatim\\Desktop\\AutoIt\\FileUpload.exe");
	}

}
