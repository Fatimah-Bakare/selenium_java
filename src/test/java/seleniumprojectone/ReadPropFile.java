package seleniumprojectone;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {


		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\fatim\\eclipse-workspace\\Test1\\src\\test\\java\\seleniumprojectone\\config.properties");
		
		prop.load(ip);

		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\geckodriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement first_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("firstName_xpath"))));
		first_name.sendKeys(prop.getProperty("firstName"));
		
		WebElement last_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("lastName_xpath"))));
		last_name.sendKeys(prop.getProperty("lastName"));
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("email_xpath"))));
		email.sendKeys(prop.getProperty("email"));
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("password_xpath"))));
		password.sendKeys(prop.getProperty("password"));
		
//		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys("firstName");
//		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys("lastName");
//		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("email");
//		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys("password");
	}

}
