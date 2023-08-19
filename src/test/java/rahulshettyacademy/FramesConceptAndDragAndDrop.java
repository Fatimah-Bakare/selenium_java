package rahulshettyacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesConceptAndDragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		//To find how many frames are available in the application:
//		System.out.println(driver.findElements(By.tagName("iframe")).size());

		Actions action = new Actions(driver);
//		action.clickAndHold(driver.findElement(By.id("draggable")))
//				.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target).build().perform();

	}

}
