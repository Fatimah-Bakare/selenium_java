package seleniumprojectone;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUps {

	public static void main(String[] args) throws InterruptedException {
		
		//1. alerts -- JavaScript Pop UP -- Alert API (accept, dismiss)
		//2. File Upload pop up -- Browse Button (type = file, sendKeys(path))
		//3. Browser Window Pop up -- Advertisement pop up (windowHandler API - getWindowHandles())
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//get url of the pop up site:
		driver.get("");

		//Element to click on to view the pop up
		driver.findElement(By.xpath("Path")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentwindowId = it.next();
		System.out.println("Parent window Id" + parentwindowId);
		
		String childwindowId = it.next();
		System.out.println("Child window Id" + childwindowId);
		
		driver.switchTo().window(childwindowId);
		
		Thread.sleep(2000);
		
		System.out.println("child window pop up title" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		
		Thread.sleep(2000);
		
		System.out.println("Parent window pop up title" + driver.getTitle());
	}

}
