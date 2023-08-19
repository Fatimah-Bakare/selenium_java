package rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("John Doe");
		driver.findElement(By.name("email")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("johndoe@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(gender);
		dropDown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("06/12/2023");
		driver.findElement(By.xpath("//input[contains(@class, 'btn-success')]")).click();
		//div[contains(@class, 'alert-success')]
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		

	}

}
