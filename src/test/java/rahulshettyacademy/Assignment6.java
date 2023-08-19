package rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(option);

		WebElement selectOption = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(selectOption);
		dropDown.selectByVisibleText(option);

		driver.findElement(By.id("name")).sendKeys(option);

		driver.findElement(By.id("alertbtn")).click();
		String alertMessage = driver.switchTo().alert().getText();

		if (alertMessage.contains(option)) {
			System.out.println("Option is present in alert message");
		} else {
			System.out.println("Option not present in alert message");
		}

	}

}
