package seleniumprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch browser:
		WebDriver driver = new ChromeDriver();
		
		//get url:
		driver.get("https://www.freecrm.com/index.html");
		
		//get and print page title:
		String title = driver.getTitle();
		System.out.println(title);
		
		//find elements:
		WebElement login_btn = driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]"));
		login_btn.click();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("teemakareem96@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("P@ssw0rd123");
		
		WebElement login_field = driver.findElement(By.xpath("//div[text()='Login']"));
		login_field.click();
		
		//this line of code is used to switch from one frame to another:
		//driver.switchTo().frame("frameName");
		
		//Thread.sleep(3000);
		
		WebElement contacts = driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]"));
		contacts.click();
		
		Thread.sleep(3000);
		
		WebElement add_btn = driver.findElement(By.cssSelector(".button1"));
		add_btn.click();
				

	}

}
