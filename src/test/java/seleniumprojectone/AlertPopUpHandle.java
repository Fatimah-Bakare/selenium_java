package seleniumprojectone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch browser:
		WebDriver driver = new ChromeDriver();
		
		//get url:
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//get and print page title:
		String title = driver.getTitle();
		System.out.println(title);
		
		//find element:
		WebElement signin = driver.findElement(By.name("proceed"));
		signin.click();
		
		Thread.sleep(5000);
		
		//switch control to the alert window/frame:
		Alert alert = driver.switchTo().alert();
		//get the text of that particular alert:
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
		
		
		//clicks on OK button:
		alert.accept();
		
		//clicks on cancel button:
		//alert.dismiss();

	}

}
