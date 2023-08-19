package rahulshettyacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Sibling-child to parent Traverse:
		
		//Parent to child --> sibling to sibling
		//header/div/button[1]/following-sibling::button[1]
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//Child --> parent
		//header/div/button[1]/parent::div
		//header/div/button[1]/parent::div/parent::header
		//header/div/button[1]/parent::div/parent::header/a[1]
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		

	}

}
