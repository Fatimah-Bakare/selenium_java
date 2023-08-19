package seleniumprojectone;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch chrome:
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get url:
		driver.get("https://classic.freecrm.com/index.html?e=1");
		
		String title = driver.getTitle();
		System.out.println("Before login title is " + title);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("fatimah");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
//		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();

		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));
		
//		flash(loginBtn, driver);
		spotlight(driver, loginBtn);
		
		Thread.sleep(2000);
		
		//Take screenshot and store as a file format:
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		//now copy the screenshot to your desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\fatim\\eclipse-workspace\\Test1\\src\\test\\java\\seleniumprojectone\\crmpro.png"));

		//generate Alert
		//generateAlert (driver, "There is an issue with Login button on Login Page");
		
		//click on any element by using JS executor
		clickElementByJS(loginBtn, driver);
		
		//refresh the page:
		//1. by using Selenium:
		driver.navigate().refresh();
		
		//2. by using JS executor:
		refreshBrowserByJS(driver);
		
		//get the title of the page by JS:
		System.out.println(getTitleByJS(driver));
		
		//get the page text:
		System.out.println(getPageInnerText(driver));
		
		//scroll page down:
		//scrollPageDown(driver);
		
		//method1:
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot Password?')]"));
		scrollIntoView(forgotPwdLink, driver);
		
		//method2:
//		WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Forgot Password?')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		
//		Thread.sleep(500); 
		
		//method3:
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		WebElement forgotPwdLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Forgot Password?')]")));
//		scrollIntoView(forgotPwdLink, driver);
	}

	
//	public static void flash(WebElement element, WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String bgcolor = element.getCssValue("backgroundColor");
//		for (int i = 0; i < 100; i++) {
//			changeColor("rgb(0, 200, 0)", element, driver);//1
//			changeColor(bgcolor, element, driver);//2
//
//		}
//	}
//	
//	
//	public static void changeColor(String color, WebElement element, WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].style.backgroundColor - '" +color+ "'", element);
//		
//		try {
//			Thread.sleep(20);
//		}catch (InterruptedException e) {
//		}
	
	public static void spotlight(WebDriver driver, WebElement element) {
	    JavascriptExecutor jsexecute = (JavascriptExecutor) driver;
	    jsexecute.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid green;');", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" +message+ "')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
