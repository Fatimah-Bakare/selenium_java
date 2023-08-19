package rahulshettyacademy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[id='okayBtn']")));
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
		WebElement userType = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(userType);
		dropdown.selectByVisibleText("Consultant");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='terms']")));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		String[] phoneModels = {"iphone", "Samsung", "Nokia", "Blackberry"};
		addItems(driver, phoneModels);
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("country")));
		driver.findElement(By.id("country")).sendKeys("Malaysia");
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();

	}
	
	public static void addItems(WebDriver driver, String[] phoneModels)
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		
		for (int i=0; i<products.size(); i++) 
		{
			String[] name = products.get(i).getText().split(" ");
			String formattedName = name[0];
			
			List itemsNeededList = Arrays.asList(phoneModels);
			
			if (itemsNeededList.contains(formattedName)) 
			{
				j++;
				
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				if (j == phoneModels.length) 
				{
					break;
				}
			}
		}
	}

}
