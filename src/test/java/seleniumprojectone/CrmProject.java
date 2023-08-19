package seleniumprojectone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrmProject {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//get URL
		driver.get("https://www.freecrm.com/");
		
		//Click on login button
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]")).click();
		
		//enter login details
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("teemakareem96@gmail.com");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd123");
		
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		
		Thread.sleep(5000);
		
		//click on calendar field
		driver.findElement(By.xpath("//a[@href='/calendar']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		//click on the calendar Add button
		WebElement calenderAdd = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[@href='/contacts']//parent::div[@class='menu-item-wrapper']//preceding-sibling::div[@class='menu-item-wrapper']//button[@class='ui mini basic icon button']")));
		calenderAdd.click();
		
		//fill in the calendar Add form
		WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("title")));
		title.clear();
		title.sendKeys("QA Testing Environment");
		
		WebElement category = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui selection dropdown' and @name='category']")));
		category.click();
		
		WebElement important = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Important']")));
		important.click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This is a Quality Assurance Test Training");
		
		driver.findElement(By.xpath("//div[@class='ui toggle checkbox']")).click();
		
		WebElement task = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@fdprocessedid='ff5l4a']")));
		task.sendKeys("QA Testing");
		
		driver.findElement(By.xpath("(//input[@class='search']/following-sibling::i)[3]")).click();
		
		driver.findElement(By.className("minutesBefore")).click();
	}

}
