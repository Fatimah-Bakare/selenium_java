package rahulshettyacademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println(column.size());
		
		List<WebElement> rowTwo = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		
		for (int i=0; i<rowTwo.size(); i++) 
		{
			System.out.println(rowTwo.get(i).getText());
		}

	}

}
