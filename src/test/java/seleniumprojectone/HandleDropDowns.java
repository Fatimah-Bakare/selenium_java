package seleniumprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch driver:
		WebDriver driver = new ChromeDriver();
		
		//get driver:
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//get and print page title:
		String title = driver.getTitle();
		System.out.println(title);
		
		//find elements:
		WebElement subdomain = driver.findElement(By.id("Form_getForm_subdomain"));
		subdomain.sendKeys("meerah");
		
		WebElement fullname = driver.findElement(By.id("Form_getForm_Name"));
		fullname.sendKeys("John Doe");
		
		WebElement email = driver.findElement(By.id("Form_getForm_Email"));
		email.sendKeys("johndoe@gmail.com");
		
		WebElement contact = driver.findElement(By.id("Form_getForm_Contact"));
		contact.sendKeys("01157786345");
		
		//drop down element:
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(country);
		select.selectByVisibleText("Malaysia");
		
		WebElement recaptcha = driver.findElement(By.className("recaptcha-checkbox-border"));
		recaptcha.click();
		
		WebElement submit = driver.findElement(By.id("Form_getForm_action_submitForm"));
		submit.click();

	}

}
