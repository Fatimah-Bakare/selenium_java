package seleniumprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch driver:
		WebDriver driver = new ChromeDriver();
		
		//get url:
		driver.get("https://html.com/input-type-file/");
		
		//get and print page title:
		String title = driver.getTitle();
		System.out.println(title);
		
		//find element:
		// this only works when type="file" is available in the html structure
		// type = "file" should be present for browse/attach file/upload file
		WebElement browse_button = driver.findElement(By.xpath("//*[@id=\"fileupload\"]"));
		browse_button.sendKeys("C:\\Users\\fatim\\Downloads\\TestProject-CSS-Selectors-Cheatbook.pdf");

	}

}
